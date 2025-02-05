package Practice;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str = " Hello Boy how are you! and how is your day ";
//        System.out.println(str.strip());
//        str = str.strip();
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.trim());
    }
}
