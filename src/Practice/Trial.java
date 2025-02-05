package Practice;

class A{
    void m1() {
        System.out.println("1111");
    }
}
class B extends A{
    public void m1(){
        System.out.println("2222");
    }
}

public class Trial {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}
