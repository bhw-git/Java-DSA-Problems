package SwapExamples;

import java.util.Arrays;

public class SwapWithLogicalOperator {
    public static void main(String[] args){
        int x = 821;
        int y = 39;
        System.out.print("Before Swapping: ");
        System.out.println(x+ " " +y);
        System.out.print("After Swapping: ");
        System.out.println(Arrays.toString(swap(x, y)));
    }
    private static int[] swap(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        return new int[]{x,y};
    }
}
