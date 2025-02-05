package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int a = 10;
        a  = 45;
        System.out.println(a);
        int [] arr = {6,3,7,2,1,5,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while((arr[i] - 1) != i){
                int value = arr[i];
                int temp = arr[value - 1];
                arr[value - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
