package Practice.Bitwiseproblems;

public class FindUniqueElementwiththreeduplicatevalues{
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,5,5,7,5,5,7,7};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        // This solution doesn't works till now and need to find the solution
        int answer = arr[0];
        for(int n=1; n < arr.length;n++){
            answer |= n;
        }
        answer = answer % 3;
        return answer;
    }
}
