package LeetCodeProblems;

import java.util.HashMap;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romantoint("MCMXV"));
    }
    private static int romantoint(String str){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        str = str.replace("IV","IIII");
        str = str.replace("IX","VIIII");
        str = str.replace("XL","XXXX");
        str = str.replace("XC","LXXXX");
        str = str.replace("CD","CCCC");
        str = str.replace("CM","DCCCC");

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += hashMap.get(str.charAt(i));
        }
        return result;
    }
}
