package SortingAlgorithms;

import java.util.Arrays;
// Time complexity = worst case : O(n^2) //Array is not sorted
//                   Best case  : O(n) //If array is already sorted
// Space complexity = O(1)
// Stable sorting
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5, 23, 19, 28, 4, 1};
//        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        // If swapping has not occured for a complete iteration of i loop then break.
        // which mean there is not even a single value is swapped in the array for 1st iteration.
        // which mean the array is already swapped
        Boolean swapped;   //used to check array is sorted already
        for (int i = 0; i < arr.length; i++) {
            swapped = false;   //used to check array is sorted already
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){ //breaks the loop if the array is already sorted
                break;
            }
        }
    }
}
