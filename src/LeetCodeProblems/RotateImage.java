package LeetCodeProblems;

//Leetcode: 48
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        transposeandmirror(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void transposeandmirror(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            for (int k = 0; k < (matrix.length + 1) / 2; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][matrix.length - 1 - k];
                matrix[i][matrix.length - 1 - k] = temp;
            }
        }
//        mirror(matrix);
    }
    private static void mirror(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length + 1)/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - j - 1];
                arr[i][arr.length - j - 1] = temp;
            }
        }
    }
}
