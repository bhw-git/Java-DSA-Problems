package ArrayandArrayListExample;

import java.util.*;

public class SetsAndListExample {
    public static void main(String[] args) {

        int[] arr = {532, 31, 542, 12, 85, 31};

        //ArrayList
        //ordered Insertion of elements
        //Allow duplicate elements
        //can access and modify values via .get() and .set() method
        //No null entry
        //Arraylist is used where data retrieval is important than manipulating data
        //No performance change is noticed in both arraylist and linkedlist for short list

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int k: arr){
            arrayList.add(k);
        }
        System.out.println("ArrayList:" +arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " +arrayList);

        // List to Object Array
        Object[] arrvalue = arrayList.toArray();
        System.out.println("List to array:" +Arrays.toString(arrvalue));

        //LinkedList
        //ordered Insertion of elements
        //Allow duplicate elements
        //Allow null entry
        //Linked list is preferred when manipulating(add/remove) data is preferred over retrieving data

        LinkedList<Integer> linkedList= new LinkedList<>();
        for(int i : arr){
            linkedList.add(i);
        }
        linkedList.add(null);
        System.out.println("LinkedList: " +linkedList);
        linkedList.forEach(System.out::println);

        //HashSet
        //not guaranteed ordered Insertion
        //random arrangement of collection
        //Doesn't allow duplicate
        HashSet<Integer> hashset = new HashSet<>();
        for(int i: arr){
            hashset.add(i);
        }
        System.out.println("HashSet:" +hashset);

        //Syntax to convert ArrayList to HashSet
        //HashSet<Integer> hashset = new HashSet<>(arrayList);

        //Syntax to Converting HashSet to ArrayList
        ArrayList<Integer> arrlst = new ArrayList<>(hashset);
        System.out.println("HashSet to ArrayList:" +arrlst);

        //TreeSet
        //Not guaranteed ordered Insertion
        //But tree is sorted arrangement of collection
        //Doesn't allow duplicate
        TreeSet<Integer> tree = new TreeSet<>(hashset);
        System.out.println("Tree reversed: "+tree.descendingSet());
        System.out.println("TreeSet:" +tree);

        //LinkedHashSet
        //Ordered insertion is maintained
        //No Duplicates are allowed
        LinkedHashSet<Integer> lshashset = new LinkedHashSet<>();
        for (int j : arr) {
            lshashset.add(j);
        }

        System.out.println("Size of LinkedHashSet: "+lshashset.size());
        System.out.println("LinkedHashSet:" +lshashset);

        //set to array convertion
        Object[] arr2 = lshashset.toArray();
        System.out.println("arraylist to array: "+Arrays.toString(arr2));

    }
}
