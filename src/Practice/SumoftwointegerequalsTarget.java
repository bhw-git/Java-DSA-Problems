package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumoftwointegerequalsTarget {
    public static void main(String[] args) {
        String str = " he llo boy ";
        System.out.println(str.strip().substring(0,3));
        System.out.println(Arrays.toString(str.replace(" ", "").split(" ")));
        int[] arr = {23,73,50,29,41};
        System.out.println(Arrays.toString(solution(arr, 91)));
    }
    public static int[] solution(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
}