package Polymorphism;

public class Tryoverloading {
    public static void main(String[] args) {
//        Tryoverloading obj = new Tryoverloading();
//        Over over = obj.new Over();
        Over.method();
        Over.method(1,"Hai");
        Over.method("Hello", 2);
    }
    private class Over {
        public static void method(int i, String str) {
            System.out.println("Integer first " + "String next");
        }
        public static void method(String str, int i) {
            System.out.println("String first " + "Integer next");
        }
        public static void method() {
            System.out.println("No parameter method");
        }
    }
}

