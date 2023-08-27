import org.w3c.dom.Node;

public class doublyLinkedList {
      Node head;
     Node tail;
    private class Node {
        Node previous;
        private int value;

        Node(int item) {
            this.value = item;
        }

        private Node next;

    }

    public void addLast(int value){
        Node temp = new Node(value);
        var previous = head;
        if(isEmpty())
            head=tail=temp;
        else
            tail.next = temp;
            temp.previous = tail;
            tail = temp;

    }
    boolean isEmpty() {

        return head == null;

    }

    public void addFirst(int value){
        Node item = new Node(value);
        item.next = head;
        item.previous = null;
        if(isEmpty())
            head=tail=item;
        else
        if (head != null) {
            head.previous = item;
        }

        head = item;
    }



   public void print(){
        var current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
   }



}
