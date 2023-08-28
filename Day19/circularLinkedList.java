import org.w3c.dom.Node;

public class circularLinkedList {

    Node head;

    public static void main(String[] args) {
        circularLinkedList cl = new circularLinkedList();
        cl.head = new Node(10);
        cl.head.next = new Node(20);
        cl.head.next.next = new Node(30);
        cl.head.next.next.next = new Node(40);
        cl.head.next.next.next.next = cl.head;

        cl.print();
    }
    static  class Node{
        int data;
        Node next;
        Node(int value){
            this.data = value;
        }
    }
    void print(){
        if(head!=null)
            System.out.print(head.data+" ");
        var current = head.next;
        while (current!=head){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
}
