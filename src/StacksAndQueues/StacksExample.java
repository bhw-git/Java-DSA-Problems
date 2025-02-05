package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class StacksExample {
    public static void main(String[] args) {
        String str = "Hello World Coders";
        String[] arr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
            stringBuilder.append(" ");
        }
        System.out.println("StringBuilder Reversed: " +stringBuilder);

//        for(int j = 0; j < arr.length; j++){
//            arr[j] = stack.pop();
//        }
//        String fnl = String.join(" ", arr);
//        System.out.println("Reversed String: " +fnl);
//        System.out.println("StringBuilder: " +stringBuilder);
        System.out.println("reverse character inplace: " +reverseEachCharacterInPlace(str));
    }
    public static StringBuilder reverseEachCharacterInPlace(String str){
        String[] str1 = str.split(" ");
        StringBuilder raw = new StringBuilder();
        StringBuilder neww = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            raw.append(str1[i]);
            raw.reverse();
            neww.append(raw);
            neww.append(" ");
            raw.delete(0,str1[i].length());
        }
        return neww;
    }
}
