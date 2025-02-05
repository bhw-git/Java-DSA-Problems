package Practice.Bitwiseproblems;

public class Numberispoweroftwoornot {
    public static void main(String[] args) {
        int n= 0;
        // Edge case
        if (n == 0){
            System.out.println(n+ " is not power of 2");
            return;
        }
        // Main case
        boolean answer = (n & (n-1)) == 0;
        if(answer){
            System.out.println(n+ " is power of 2");
        }
        else{
            System.out.println(n+ " is not power of 2");
        }
    }
}
