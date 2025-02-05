package LeetCodeProblems.CyclicSort;
// Leetcode Problem number: 268
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        System.out.println(missingnumber(nums));
    }
    public static int missingnumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            // Here we have a check if nums[i] is equals to the nums.length then dont swap and just
            // increment i and continue.
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
