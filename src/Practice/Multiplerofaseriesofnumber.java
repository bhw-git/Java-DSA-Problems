package Practice;

import java.util.Scanner;

public class Multiplerofaseriesofnumber {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number X: ");
        int num = in.nextInt();
        if(num > 100){
            throw new Exception("Value is above 100");
        }
        System.out.print("Range of the number "+num +" till: ");
        int range = in.nextInt();
        for (int i = 0; i <= range; i+=num) {
            System.out.print(i +", ");
        }
    }
}
