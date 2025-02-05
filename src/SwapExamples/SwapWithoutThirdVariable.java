package SwapExamples;

import java.util.Arrays;

public class SwapWithoutThirdVariable {
    public static void main(String[] args){
        int a = 25;
        int b = 38;
        System.out.print("Before Swapping: ");
        System.out.println(a + " " +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After Swapping: ");
        System.out.println(a + " " +b);
        System.out.println(Arrays.toString(swap(a, b)));
    }
    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[] {a,b};
    }
}

