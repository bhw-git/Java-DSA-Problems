package LeetCodeProblems;
// not working for all testcases till now.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Leetcode: 2099
public class FindSubsequenceoflengthkwithlargestsum {
    public static void main(String[] args) {
        int[] nums = {33,-27,-9,-83,48};
        System.out.println(Arrays.toString(maxSubsequence(nums,2)));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        if(nums.length <= 2 || k  == nums.length){
            return nums;
        }

        int[] copy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);

        int[] reminder = new int[nums.length - k];
        for(int i = 0; i < reminder.length; i++){
            reminder[i] = copy[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0 ; j < reminder.length; j++){
                if(reminder[j] != nums[i] || i > k){
                    count++;
                    if(count == reminder.length){
                        list.add(nums[i]);
                    }
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

//        for(int i = nums.length - 1; i >= 0; i--){
//            if(map.containsKey(arr[i])){
//                list.add(map.get(arr[i]));
//            }
//        }
//
//        int[] result = new int[k];
//        int j = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(list.contains(i)){
//                result[j] = nums[i];
//                j++;
//            }
//        }
        return result;
    }
}
