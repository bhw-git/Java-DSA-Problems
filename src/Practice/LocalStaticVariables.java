package Practice;

public class LocalStaticVariables {
    public static void main(String[] args) {
        X a = new X();
        a.mx();
    }
}
class X{
    static int a = 10;
    void mx(){
        // method level variable cannot be static
        int b = 23;
        System.out.println(b);
    }
}
