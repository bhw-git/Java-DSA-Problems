package Practice.Bitwiseproblems;

public class FindOddOrEven {
    public static void main(String[] args) {
        int a = 5;
        // Binary of 5 is (101) base 10
        // 1 0 (1) --> is the LSB (Least Significant Bit)
        // If LSB is 1 then the number is Odd else if LSB is 0 the number is even
        boolean answer = (a & 1) == 1;
        if(answer){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
