package Practice;

public class Sumofnumbersinstring {
    public static void main(String[] args){
        System.out.println(findsum("13bs3c4"));
    }
    private static int findsum(String str){
        if(str == null){
            return 0;
        }
        StringBuilder temp = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                temp.append(c);
            }
            // (String of numbers) to integer convertion ==> int a = Integer.parseInt(a);
            // where String a = "4";  Not String a = "alphabets";
            else{
                sum += Integer.parseInt(temp.toString());
                temp = new StringBuilder("0");
            }
        }
        return sum + Integer.parseInt(temp.toString());
    }
}
