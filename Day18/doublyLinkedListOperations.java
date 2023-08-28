
import org.w3c.dom.Node;

class doublyLinkedList {
    //int a[] = {10,60,80,};
    Node head;
    Node tail;
    private int size;

    private class Node {
        Node previous;
        private int value;

        Node(int item) {
            this.value = item;
        }

        private Node next;

    }
    int count = size();

    public void addLast(int value){
        Node temp = new Node(value);
        var previous = head;
        if(isEmpty())
            head=tail=temp;
        else
            tail.next = temp;
        temp.previous = tail;
        tail = temp;
        count++;

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
        if (head != null)
            head.previous = item;
        head = item;
        count++;
    }
    void addManyAtLast(int a[] ){
        for(var x:a)
            addLast(x);
    }
    void addManyAtFirst(int a[]){
        for(var y:a)
            addFirst(y);
    }

    public void addAtIndex(int index,int value){
        if(index<0||index>size())
            throw new IllegalArgumentException("Invalid index");
        if(index==0)
            addFirst(value);
        else if(index==size()){
            addFirst(value);
            return;

        }
        var node = new Node(value);
        int start = 0;
        var current = head;

        while (start<index-1){
            current = current.next;
            start++;
        }

    }

    public int size() {
        return this.size;
    }

    public void print(){
        var current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
    }


    public void removeFirst(){
        if(isEmpty())
            throw new IllegalArgumentException("No elements are there to remove");
        if(head==tail)
            head=tail=null;
        else {
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        System.out.println();
    }
    public void removeLast(){
        if(isEmpty())
            throw new IllegalStateException("No elements are there to remove");
        if(head==tail)
            head = tail = null;
        else {
            var temp = tail.next;
            temp.next.previous = null;
            temp.next = null;
            tail = temp;

        }


    }





}
