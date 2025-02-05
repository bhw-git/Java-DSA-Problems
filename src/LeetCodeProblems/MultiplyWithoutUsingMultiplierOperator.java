package LeetCodeProblems;

public class MultiplyWithoutUsingMultiplierOperator {
    public static void main(String[] args) {
        System.out.println(multiply(5,25));
        System.out.println(multiply(35,0));
        System.out.println(multiply(0,67));

    }
    private static int multiply(int a, int b){
        if(a == 0 || b == 0) return 0;
        return helper(a,b,b);
    }
    private static int helper(int a, int b, int counter){
        if(counter == 0){
            return 0;
        }
        return a + helper(a,b, counter - 1);
    }
}
