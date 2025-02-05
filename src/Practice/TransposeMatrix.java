package Practice;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        // Original matrix
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rowCount = originalMatrix.length;
        int colCount = originalMatrix[0].length;
        // Transposed matrix with swapped dimensions
        int[][] transposedMatrix = new int[colCount][rowCount];
        // Fill the transposed matrix
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        inplace(originalMatrix);
    }
    // Inplace transpose of array
    public static void inplace(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose inPlace");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
