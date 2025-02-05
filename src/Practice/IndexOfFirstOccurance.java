package Practice;

import java.util.Objects;

public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 5, 2};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        int result = max - min;
        System.out.println(result);

        String a = "sadbaddaaddad";
        String b = "dad";
        System.out.println(findIndex(a,b));
    }
    public static int findIndex(String a, String b){
        if(a.length() <= 0 || b.length() <= 0 ){
            return -1;
        }
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int count = 0;
            while(Objects.equals(a.charAt(i + count), b.charAt(count))){
                count++;
                if(count == b.length()){
                    return i;
                }
            }

        }
        return -1;
    }
}
