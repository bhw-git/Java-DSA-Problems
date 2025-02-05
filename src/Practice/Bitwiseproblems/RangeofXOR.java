package Practice.Bitwiseproblems;

public class RangeofXOR {
    public static void main(String[] args) {
        int start = 4;
        int end = 9;
        System.out.println(xorforrange(start,end));
        System.out.println(xor(9));
    }
    // XOR for a range of numbers
    private static int xorforrange(int start, int end){
        return xor(end) ^ xor(start-1);
    }


    // XOR from 0 to n
    private static int xor(int n) {
        if((n%4) == 0){
            return n;
        }
        if((n%4) == 1){
            return 1;
        }
        if((n%4) == 3){
            return n+1;
        }
        return 0;
    }
}
