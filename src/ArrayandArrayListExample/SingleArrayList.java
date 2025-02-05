package ArrayandArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SingleArrayList {
    public static void main(String[] args) {
        char a = 'A';
        float f = a * 10;
        System.out.println((int)a);
        System.out.println(f);

        // 2D array Input
        int[][] arr = new int[3][4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // 1st method to output 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //2nd method to output 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        // 3rd method to output 2D array
        for(int[] x: arr){
            System.out.println(Arrays.toString(x));
        }

        // ArrayList input and output
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            ls.add(in.nextInt());
        }
        System.out.println(ls);
    }
}
