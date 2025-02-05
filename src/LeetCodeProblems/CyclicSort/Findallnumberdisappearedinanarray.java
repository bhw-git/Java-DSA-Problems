package LeetCodeProblems.CyclicSort;

import java.util.List;
import java.util.ArrayList;

// Leetcode : 448
public class Findallnumberdisappearedinanarray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findmissing(nums));
    }
    public static List<Integer> findmissing(int[] nums){
        ArrayList<Integer> list  = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
