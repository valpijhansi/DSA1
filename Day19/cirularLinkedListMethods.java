import org.w3c.dom.Node;
public class cirularLinkedListMethods {
    Node head;
    private class Node{
       // public int value;
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
    public void addFirst(int data){
        var node = new Node(data);
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

    void addFirstOptimized(int value){
        var node = new Node(value);
        if(head==null){
            head = node;
            head.next = head;
        }else{
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            var backUp = head.next;
            head.next = node;
            node.next = backUp;
        }
    }

    void addLastOptimized(int value){
        var node = new Node(value);
        if(head==null){
            head = node;
            head.next = head;
        }else {
            node.next = head.next;
            head.next = node;
            int temp = node.data;
            node.data = head.data;
            head.data = temp;
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
