package ArrayandArrayListExample;

import java.util.Arrays;

public class SwapIntegersUsingArray {
    public static void main(String[] args) {
        int[] arr = {3, 53, 83, 32, 13};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
