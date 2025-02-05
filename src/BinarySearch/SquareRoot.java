package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squarerootusingbinary(6));
        System.out.println(findsquareroot(81));
        System.out.println(sqrtusinglog(2147395600));
    }
    public static double findsquareroot(int n){
        double low = 0;
        double high = n;
        double epsilon = 1e-7;
        while((high - low) > epsilon){
            double mid = low + (high - low) / 2;
            if(mid * mid > n){
                high = mid;
            }
            else{
                low = mid;
            }
        }
        return (high + low)/2;
    }

    //Using logarithmic function.
    public static int sqrtusinglog(int n){
        return (int) Math.round(Math.exp(.5 * Math.log(n)));
    }

    public static int squarerootusingbinary(int x){
        int low = 1;
        int high = x;
        if(x <= 1){
            return x;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid > x / mid){
                high = mid-1;
            }
            else if(mid * mid < x){
                low = mid+1;
            }
            else {
                return mid;
            }
        }
        return high;
    }
}
