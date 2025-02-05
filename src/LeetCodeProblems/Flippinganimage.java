package LeetCodeProblems;


import java.util.Arrays;

// Leetcode : 832
public class Flippinganimage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flip(image);
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    // XOR a ^ 1 = ~a;

    private static int[][] flip(int[][] image){
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col <= (image[row].length/2); col++) {
                int temp = image[row][col] ^ 1;
                image[row][col] = image[row][image[row].length - col - 1] ^ 1;
                image[row][image[row].length-col-1] = temp;
            }
        }
        return image;
    }
}
