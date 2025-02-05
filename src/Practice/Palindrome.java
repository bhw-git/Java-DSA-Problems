package Practice;

import java.io.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ls = in.nextLine();
        int b = ls.length();
        int count = 0;
        for(int i=0; i<b/2; i++) {
            count++;
            if(ls.charAt(i) != ls.charAt(b-i-1)){
                System.out.println("The given String is not Palindrome");
                return;
            }
        }
        System.out.println("The given String is Palindrome");
    }
}
