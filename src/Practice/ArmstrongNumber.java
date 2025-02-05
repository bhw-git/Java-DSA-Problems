package Practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(armstrong(num));
    }
    public static boolean armstrong(int num){
        int sum = 0,temp = num,count = 0;
        ///////////////////////////////////////
//        String str = Integer.toString(num);
//        int len = str.length();
        ///////////////////////////////////////
        int len = (int) (Math.log10(num) + 1);
        ///////////////////////////////////////
        while(num != 0){
            num = num / 10;
            count++;
        }
        num = temp;
        ///////////////////////////////////
        while(num != 0){
            int reminder = num % 10;
//            sum += (int) Math.pow(reminder,len);
            sum += Pow(reminder,count);
            num = num / 10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
    private static int Pow(int reminder, int len){
        int result = 1;
        while(len != 0){
            result *= reminder;
            len--;
        }
        return result;
    }
}
