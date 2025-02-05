package ArrayandArrayListExample;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {24,68,94,67,58};
        System.out.println(arr.length);
        System.out.println(MaxVal(arr));
    }

     static int MaxVal(int[] arr) {
        if(arr.length == 0) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        return max;
    }
}
