package SortingAlgorithms;

import java.util.Arrays;
// Time complexity = worst case : O(n^2)
//                   Best case  : O(n^2)
// Space complexity = O(1)
// Not Stable sorting
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {32, 93, 43, 82, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndexValue = getmaxIndex(arr, 0, last);
            swap(arr, maxIndexValue, last);
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
