package CustomStackExample;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new DynamicStack();
        customStack.push(4);
        customStack.push(7);
        customStack.push(2);
        customStack.push(9);
        customStack.push(24);
        customStack.push(86);
        customStack.push(54);
        customStack.push(91);
        customStack.push(784);
        customStack.push(234);
        customStack.push(389);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

//        System.out.println(customStack.peek());


    }
}
