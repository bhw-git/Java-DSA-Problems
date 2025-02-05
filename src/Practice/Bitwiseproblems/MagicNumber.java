package Practice.Bitwiseproblems;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }
    // Decimal --> Binary value --> Base value with 5 taken here --> Sum of digits --> Magic number
    //      2        0  1  0         5^3 * 0 | 5^2 * 1 | 5^1 * 0      0 + 25 + 0          25
    //      3        0  1  1         5^3 * 0 | 5^2 * 1 | 5^1 * 1      0 + 25 + 5          30
    //      4        1  0  0         5^3 * 1 | 5^2 * 0 | 5^1 * 0      125 + 0 + 0         125
    //      5        1  0  1         5^3 * 1 | 5^2 * 0 | 5^1 * 1      125 + 0 + 5         130
    //      6        1  1  0         5^3 * 1 | 5^2 * 1 | 5^1 * 0      125 + 25 + 0        150

    private static int solution(int n) {
        int answer = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            answer += last * base;
            n = n >> 1;
            base = base * 5;
        }
        return answer;
    }
}
