package StaticMethodExample;

public class Statictrialmain {
    public static void main(String[] args) {
        Statictrialmethod s = new Statictrialmethod();
        Statictrialmethod s1 = new Statictrialmethod();
        s.fun();
        System.out.println(Statictrialmethod.a);
        System.out.println(Statictrialmethod.b);
        Statictrialmethod.b = 99;
        s.fun();
        System.out.println(Statictrialmethod.b);

    }
}
