package StaticMethodExample;

public class StaticAccessVariable {
    public static void main(String[] args) {
        Test test = new Test();
        Test f = new Test();
        test.example = 94;
        Test.example = 1553;
        test.example = 713;
        // System.out.println(test.example);
        System.out.println("I have " + test.h() + " question!");
    }
}
class Test {
    static int example = 1;
    public int h(){
        return example;
    }
}
