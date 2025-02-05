package Practice;

import java.util.Scanner;

public class largerpreviousnumber {
    public static void main(String[] args) {
        int count=0;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] > arr[i]){
                count++;
            }
            else continue;
        }
        System.out.println(count);
    }
}
