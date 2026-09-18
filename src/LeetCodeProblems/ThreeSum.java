package LeetCodeProblems;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int left = 0; left < nums.length - 2; left++){
            if(left > 0 && nums[left] == nums[left-1]) continue;
            if(nums[left] > 0) break;

            int mid = left + 1;
            int right = nums.length - 1;
            while(mid < right){
                int sum = nums[left] + nums[mid] + nums[right];
                if(sum == 0){
                    list.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    while(mid < right && nums[mid] == nums[mid+1]) mid++;
                    while(mid < right && nums[right] == nums[right-1]) right--;
                    mid++;
                    right--;
                }
                else if(sum < 0) mid++;
                else right--;
            }
        }
        return list;
    }
}
