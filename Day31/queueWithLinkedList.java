import java.lang.reflect.Array;
import java.util.ArrayList;

public class queueWithLinkedList {
    private class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int count;

    void enqueue(int item){
        Node node = new Node(item);
        if (head==null){
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        count++;
    }
    int dequeue(){
        if(head==null)
            throw new IllegalStateException();
        int data = head.data;
        if(head==tail){
            head = tail = null;
        } else {
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        count--;
        return data;
    }
    int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return head.data;
    }
    private boolean isEmpty(){
         return  head == null;
    }
    int size(){
        return count;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        var current = head;
        while(current!=null) {
            list.add(current.data);
            current = current.next;
        }
        return list.toString();
    }
}
