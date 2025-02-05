package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        String str = "Hai this is a string";
//        char[] ch = str.toCharArray();
        String[] ch = str.split(" ");
        for (int i = 0; i < ch.length / 2; i++) {
            String temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }
        for (String c : ch) {
            System.out.print(c + " ");
        }
//        usingStack(str);
    }
    public static void usingStack(String str){
        Stack<String> stack = new Stack<>();
        String[] arr = str.split(" ");
        int i = 0;
        while(i < arr.length){
            stack.push(arr[i]);
            i++;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
