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

    public void add(int value){
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

   public void print(){
        var current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
   }



}
