package ArrayandArrayListExample;

import java.util.Arrays;

public class ReverseArrayUsingSwap {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 6, 7, 8};
        reversearray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reversearray(int[] arr) {

        int start = 0;
        int end = arr.length -1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

//        Direct method to swap the array itself

//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
