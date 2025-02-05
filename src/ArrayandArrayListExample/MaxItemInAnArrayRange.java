package ArrayandArrayListExample;

public class MaxItemInAnArrayRange {
    public static void main(String[] args) {
        int[] arr = {3522, 834, 26, 353, 252, 1513};
//        int[] arr = {1, 4};
        System.out.println(maxvalue(arr, 0, 3));
    }
    public static int maxvalue(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        if(arr.length == 0) return -1;

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
