package GeeksforGeeks;

import java.util.ArrayList;
import java.util.List;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,5,5,6,7,8,9};
        System.out.println(Solution.findUnion(a, b));
    }
}
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0, i = 1;
        int len_a = a.length;
        int len_b = b.length;
        while(i < len_a){
            if(a[i-1] != a[i]){
                a[ptr1++] = a[i-1];
                i++;
            }
            else i++;
        }
        if(a[ptr1] != a[len_a - 1]){
            a[ptr1] = a[len_a - 1];
        }
        i = 1;
        while(i < len_b){
            if(b[i-1] != b[i]){
                b[ptr2++] = b[i-1];
                i++;
            }
            else i++;
        }
        if(b[ptr2] != b[len_b - 1]){
            b[ptr2] = b[len_b - 1];
        }

        int x = 0, y = 0;
        while(x <= ptr1 && y <= ptr2){
            if(a[x] < b[y]){
                list.add(a[x++]);
            }
            else if(b[y] < a[x]){
                list.add(b[y++]);
            }
            else{
                list.add(a[x]);
                x++;
                y++;
            }
        }
        while(x <= ptr1){
            list.add(a[x++]);
        }
        while(y <= ptr2){
            list.add(b[y++]);
        }
        return list;
    }
}