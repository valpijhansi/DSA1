import org.w3c.dom.Node;

public class CircularDoublyLinkedList {
    Node head;
    private class Node{

        int data;
        Node next;
        Node prev;
        Node(int value){
            this.data = value;
        }
    }

    public  void addLast(int value){
        var node = new Node(value);
        if(head==null) {
            head = node;
            head.next = head.prev = head;
        }else {
            var current = head.prev;
            current.next = node;
            node.next = head;
            head = node;

        }
    }

    public void addFirst(int value){
        var node = new Node(value);
        if(head == null) {

            node.next = node.prev = node;
            head = node;
        }else {
            Node current=head;
            while(current.next!=head) {
                current=current.next;
            }
            current.next = node;
            node.prev = current;
            node.next = head;
            head.prev = node;
            head = node;
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
