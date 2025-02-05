package Practice;

import java.io.*;
import java.util.*;

public class Automobile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int w = in.nextInt();
        float result = (float) ((v*4)-w)/2;
        if(w>=2 && (w%2==0) && w>v){
            System.out.println("TW:" + result + "FW:" + (v - result));
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
