package HashMapExamples;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bhuvanesh", 10);
        hashMap.put("rahul", 54);
        hashMap.put("karthi", 91);
        hashMap.put("mani", 25);
        hashMap.put("ramana", 46);
        hashMap.put("veera", 54);
        hashMap.putIfAbsent("vikram", 459);
        hashMap.remove("vikram");
        System.out.println(hashMap.size());
        System.out.println(hashMap);
        System.out.println(hashMap.get("Bhuvanesh"));

    }
}
