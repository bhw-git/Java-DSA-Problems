package LeetCodeProblems;

//Leetcode : 1342
// Using recursion
public class Numberofstepstoreduceanumbertozero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }

}
