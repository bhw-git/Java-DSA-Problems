package Practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(3);
        ls.add(6);
        System.out.println(ls);
        System.out.println(ls.contains(3));
        for (int i = 0; i < 5; i++) {
            ls.add(in.nextInt());
        }
        System.out.println(ls);
        System.out.println(ls.remove(1));
        System.out.println(ls);
        System.out.println(ls.set(0,456));
        System.out.println(ls);
        System.out.println(ls.get(4));
        int[][] arr = new int[3][3];
        for(int row = 0; row < arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("Two Dimensional Array:-");
        for(int a=0; a < arr.length; a++){
            System.out.println(Arrays.toString(arr[a]));
        }
    }
}
