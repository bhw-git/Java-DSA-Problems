package Practice.Bitwiseproblems;

public class SumofPascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
//        This is one of the method for solution
//        System.out.println(Math.pow(2,n-1));
        System.out.println(solution(n));
    }
//  Pascals Triangle          row       sum of row
//    1                         1           1  (1)
//    1 1                       2           2  (1+1)
//    1 2 1                     3           4  (1+2+1)
//    1 3 3 1                   4           8  (1+3+3+1)
//    1 4 6 4 1                 5           16 (1+4+6+4+1)
//    1 5 10 10 5 1             6           32 (1+5+10+10+5+1)

    private static int solution(int n) {
        return 1 << (n-1);
    }
}
