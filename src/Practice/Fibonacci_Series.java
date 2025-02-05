package Practice;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter the number of Fibonacci Series: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print (fibonacci(i) + ",");
        }
    }
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}