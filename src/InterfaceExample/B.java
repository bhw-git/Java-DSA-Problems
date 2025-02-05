package InterfaceExample;

public class B implements A.NestedInterface{
    @Override
    public void greeting() {
        System.out.println("This is Overridden class");
    }
    static{
        System.out.println("Hello");
    }
}
