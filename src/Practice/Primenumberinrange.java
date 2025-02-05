package Practice;

import java.util.ArrayList;

public class Primenumberinrange {
    public static void main(String[] args) {
        int start = 5;
        int end = 100;
        System.out.println(findprime(start,end));
    }
    public static ArrayList<Integer> findprime(int start, int end){

        ArrayList<Integer> list = new ArrayList<>();
        if(start <= 1 || (start+1) <= 1){
            return new ArrayList<>(){};
        }
        for (int i = start; i <= end; i++) {
            if(isprime(i,end)){
                list.add(i);
            }
        }
        return list;
    }
    private static boolean isprime(int start, int end){
        for (int i = 2; i <= Math.sqrt(end); i++) {
            if(start % i == 0 && start != i){
                return false;
            }
        }
        return true;
    }
}
