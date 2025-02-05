package StaticMethodExample;

public class StaticEg {
    static int a = 20;
    public static void display(){
        System.out.println("Static method is used");
    }
    public static void main(String[] args) {
        System.out.println(a);
        display();
        System.out.println(A.f);
        System.out.println(Demo.str);
        System.out.println();
        String a = "v";
        String b = "v";
        String s = new String("v");
        String s1 = new String("v").intern(); // intern() will force the string pool the add "v" into it.
        System.out.println(a == b);
        System.out.println(a == s1);
        System.out.println(a == s);

    }
}
class A {
    static int f = 45;
}
