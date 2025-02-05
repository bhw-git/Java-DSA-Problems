package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(tail == null){
            tail = head;
        }
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            head = node;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
//        tail = node;
    }

    public void insertAfterAValue(int post_val, int cur_val){
        Node node = new Node(cur_val);
        Node prev = head;
        // If no existence of 2nd value (head.next value) found
        if(prev.next == null){
            node.next = null;
            node.prev = prev;
            prev.next = node;
            return;
        }
        //Targeted Previous value check for existence

        while(prev.val != post_val){
            while(prev != null){
                prev = prev.next;
                if(prev == null){
                    System.out.println("Target value doesn't exist");
                    return;
                }
            }
        }

        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        //Null Pointer Check
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }
//    public void displayRev(){
//        Node node = tail;
//        while(node != null){
//            System.out.print(node.val + " <- ");
//            node = node.prev;
//        }
//        System.out.print("START");
//        System.out.println();
//    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.insertFirst(5);
        obj.insertFirst(24);
        obj.insertFirst(93);
        obj.insertFirst(52);
        obj.insertLast(84);
        obj.insertAfterAValue(10, 99);
        System.out.println("Displaying LinkedList");
        obj.display();
        System.out.println();
        System.out.println("Printing in Reverse");
        obj.displayRev();
        System.out.println("Insertion in Last");
        obj.display();
    }
}
