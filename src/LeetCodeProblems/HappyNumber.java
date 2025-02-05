package LeetCodeProblems;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(findhappynumornot(n));
    }
    private static boolean findhappynumornot(int n){
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }
        while(slow != fast);
        return fast == 1;   //Can also return slow == 1;
    }
    private static int square(int val){
        int result = 0;
        while(val > 0){
            int reminder = val % 10;
            result += reminder * reminder;
            val /= 10;
        }
        return result;
    }
}
