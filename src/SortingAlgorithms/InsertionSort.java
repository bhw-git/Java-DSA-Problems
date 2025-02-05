package SortingAlgorithms;

import java.util.Arrays;
// Time complexity = worst case : O(n^2) //Array is not sorted
//                   Best case  : O(n) //If array is already sorted
// Space complexity = O(1)
// Stable sorting    //used in hybrid sorting
// Number of swaps is reduced compared to bubble sort
// Works good if array is partially sorted in some part of the array
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 23, 19, 28, 4, 1};
//        int[] arr = {2, 3};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
