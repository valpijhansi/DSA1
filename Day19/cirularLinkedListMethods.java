import org.w3c.dom.Node;
public class cirularLinkedListMethods {
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int value){
            this.data = value;
        }
    }
    public void addLast(int value){
        var node = new Node(value);
        if(head==null) {
            head = node;
            head.next = head;
        } else {
            var current = head.next;
            while(current!=head){
                current = current.next;
            }
            current.next = node;
            node.next = head;

        }
    }
    public void addFirst(int value){
        var node = new Node(value);
        if(head==null){
            head=node;
            node.next = head;
        }else {
            var current = head;
            while (current.next!=head){
                current = current.next;
            }
            current.next = node;
            node.next = head;
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
