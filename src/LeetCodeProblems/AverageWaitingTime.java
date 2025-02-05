package LeetCodeProblems;

// Leetcode : 1701
public class AverageWaitingTime {
    public static void main(String[] args) {
        int[][] arr = {
                {5,2},
                {5,4},
                {10,3},
                {20,1}
        };
        System.out.println(solution(arr));
    }
    private static double solution(int[][] customers){
        int i = 0;
        int sum = 0;
        int remainder = 0;
        for(i = 0; i < customers.length; i++){
            int j = 0;
            while(j < 1){
                if(i == 0){
                    sum = customers[0][0] + customers[0][1];
                    remainder = sum - customers[i][j];
                    break;
                }
                sum += customers[i][++j];
                if(sum > customers[i][0]){
                    remainder += sum - customers[i][--j];
                }
                else{
                    remainder += (customers[i][0] + customers[i][1]) - customers[i][--j];
                }
                j++;
            }
        }
        return (double) remainder/i;
    }
}
