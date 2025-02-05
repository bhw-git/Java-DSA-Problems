package Practice;

import java.util.*;


public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(45);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(45);
        arrayList.add(1);
//        System.out.println(arrayList);

        // converting arraylist to hashset
//        HashSet<Integer> hashSet = new HashSet<>(arrayList);
//        System.out.println(hashSet);

        // converting hashset to treeset
//        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
//        System.out.println(treeSet);

        System.out.println(duplicate(arrayList));
        System.out.println(duplicatesort(arrayList));
    }


    // Using set to find duplicate in a list
    public static Boolean duplicate(List<Integer> list) {
//        System.out.println(list);
//        System.out.println(list.get(1));
//        System.out.println(Arrays.toString(arrayList.toArray()));
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(set.contains(list.get(i))){
                return true;
            }
            else{
                set.add(list.get(i));
            }
        }
        return false;
    }


    // find duplicate using sorting by iterating through the adjacent elements
    public static Boolean duplicatesort(ArrayList<Integer> list){
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if((list.get(i)).equals(list.get(i+1))){
                System.out.println(list.get(i));
                return true;
            }
        }
        return false;
    }
}
