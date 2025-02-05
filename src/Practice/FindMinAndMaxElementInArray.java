package Practice;

public class FindMinAndMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {93,275,96,726,8359};
        if(arr.length == 0){
            System.out.println("array is empty");
            return;
        }
        System.out.println(minElement(arr));
        System.out.println(maxElement(arr));
    }
    public static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
