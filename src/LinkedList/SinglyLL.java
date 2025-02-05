package LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size = 0;
    }
    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + " -> ");
            tmp = tmp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}
