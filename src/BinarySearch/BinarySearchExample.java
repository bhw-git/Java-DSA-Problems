package BinarySearch;

public class BinarySearchExample {
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 0;
        System.out.println(arr[9]);
//        System.out.println(arr.length);
        System.out.println(findtarget(arr,target));
    }
    public static int findtarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
