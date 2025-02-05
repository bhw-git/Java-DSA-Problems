package Practice.Bitwiseproblems;

public class FindSingleOccuranceNum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,4,3,5,7,2,1,3};
        System.out.println(bitwise(arr));
    }

    // XOR follows associative property (a * b) * c = (a * c) * b
    // a ^ a = 0;
    // so all the duplicate occurs twice will become 0 and
    // the single duplicate number will be printed
    private static int bitwise(int[] arr) {
        int answer = 0;
        for(int n : arr){
            answer = answer ^ n;
        }
        return answer;
    }
}
