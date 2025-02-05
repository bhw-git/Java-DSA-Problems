package Practice;

import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        char str = '*', hsh = '#';
        int star = 0,hash=0;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        for(int j=0; j<input.length(); j++){
            if(input.charAt(j)==str) star++;
            else if (input.charAt(j)==hsh) hash++;
        }
        if ((star + hash)!=input.length()) System.out.println("Wrong input parameters");
        else if(star > hash) System.out.println("positive Integer");
        else if (hash > star) System.out.println("Negative Integer");
        else if (star == hash) System.out.println("0");
    }
}
