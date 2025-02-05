package StacksAndQueues;

import java.util.Arrays;

public class TrimExample {
    public static void main(String[] args) {
        // Define a String to be split
        String str = "  apple  , banana ;  cherry | date ";

        String[] splitArray = (str.split("[,;|]"));

        System.out.print("splitArray with .split(): ");
        System.out.println(Arrays.toString(splitArray));
        for (int i = 0; i < splitArray.length; i++) {
            splitArray[i] = splitArray[i].trim();
        }
        System.out.println(Arrays.toString(splitArray));

        // Print the resulting array
        for (String element : splitArray) {
            System.out.println(element);
        }
    }
}
