package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        if(sum > maxSum){
            return count;
        }
        if(a.isEmpty() || b.isEmpty()){
            return count;
        }

        int ans1 = twoStacks(maxSum, a.subList(1, a.size()), b, sum + a.get(0), count+1);
        int ans2 = twoStacks(maxSum, a, b.subList(1, b.size()), sum + b.get(0), count+1);

        return Math.max(ans1, ans2);
    }
}

public class GameofTwoStacks {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int maxSum = in.nextInt();
        List<Integer> a = new ArrayList<>(n);
        List<Integer> b = new ArrayList<>(m);
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }
        int result = Result.twoStacks(maxSum, a, b, 0, 0) - 1;
        System.out.println(result);
    }
}