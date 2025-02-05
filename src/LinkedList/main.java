package LinkedList;

public class main {
    public static void main(String[] args) {
        System.out.println("Singly LinkedList");
        SinglyLL obj = new SinglyLL();
        obj.insert(4);
        obj.insert(5);
        obj.insert(17);
        obj.insert(37);
        obj.display();
        System.out.println();

        System.out.println("Doubly LinkedList");
        DoublyLL obj_d = new DoublyLL();
        obj_d.insertFirst(5);
        obj_d.insertFirst(24);
        obj_d.insertFirst(93);
        obj_d.insertFirst(52);
        obj_d.display();
        System.out.println();
        System.out.println("Printing in Reverse");
        obj_d.displayRev();

        CircularLL obj_c = new CircularLL();
        System.out.println("Circular LinkedList");
        obj_c.insert(5);
        obj_c.insert(15);
        obj_c.insert(95);
        obj_c.insert(34);
        obj_c.insert(901);
        obj_c.delete(95);
        obj_c.display();
    }
}
