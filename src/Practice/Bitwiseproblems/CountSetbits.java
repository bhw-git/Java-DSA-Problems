package Practice.Bitwiseproblems;

public class CountSetbits {
    public static void main(String[] args) {
        int n = 23495;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbit(n));
    }

    private static int setbit(int n) {
        int count = 0;

        while(n > 0){
            count++;
            n = (n - (n & -n));
        }

        return count;
    }
}
