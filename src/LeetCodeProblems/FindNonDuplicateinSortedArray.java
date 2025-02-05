package LeetCodeProblems;

import java.util.Arrays;

public class FindNonDuplicateinSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int first = 0;
        for(int i = first + 1; i < nums.length; i++){
            if(nums[first] == nums[i]){
                continue;
            }
            else if(nums[first] != nums[i]){
                ++first;
                nums[first] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return first + 1;
    }
}
