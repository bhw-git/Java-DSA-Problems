package Practice.Recursion;

import java.util.Arrays;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        int a = 4;
        invertedtriangle(a,0);
        triangle(a,0);

    }
    private static void invertedtriangle(int r,int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            invertedtriangle(r,c+1);
        }
        else{
            System.out.println();
            invertedtriangle(r-1,0);
        }
    }
    private static void triangle(int r,int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            triangle(r,c+1);
            System.out.print("* ");
        }
        else{
            triangle(r-1,0);
            System.out.println();
        }
    }

}
