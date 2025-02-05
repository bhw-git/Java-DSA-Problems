package Practice.Bitwiseproblems;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int answer = 1;
        // 3 ^ 6 == (3 ^ 2) + (3 ^ 4) == 729
        // This takes O(power times) Time complexity
        while(power > 0){
            if((power & 1) == 1){
                answer *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(answer);
    }
}
