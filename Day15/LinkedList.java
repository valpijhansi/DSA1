import java.util.NoSuchElementException;

public class LinkedList {
    private int size;

    private class Node {
        private int value;

        Node(int item) {
            this.value = item;
        }

        private Node next;

    }

    private Node head;
    private Node tail;


    void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            head = tail = null;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    boolean isEmpty() {

        return head == null;

    }


    public int valueOf(int index) {

        var current = head;

        int start = 0;

        while (current != null) {
            if (start == index)
                return current.value;
            current = current.next;
            start++;
        }


        return -1;

    }

    public int getIndex(int value) {
        Node current = head;

        int start = 0;

        while (current != null) {
            if (current.value == value)
                return start;
            current = current.next;
            start++;
        }
        return -1;
    }

    boolean contains(int value) {
        return getIndex(value) != -1;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail)
            head = tail = null;
        else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
                current.next = null;
                tail = current;
            }

        }
        size--;

    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail)
            head = tail = null;
        else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
        size--;
    }

    public int size() {
        return this.size;
    }

    public void reverse() {
        if (isEmpty())
            return;
        var previous = head;
        var current = head.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    public int MiddleNode() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail)
            return head.value;
        else {
            int count = size();
            Node current = head;
            int start = 0;
            while (current != null) {
                if (start == count / 2) {
                    return current.value;
                }
                current = current.next;
                start++;
            }
        }
        return -1;
    }

    public int NthNode(int value) {
        int count = size();
        if (value < 0 || value > count)
            throw new IllegalArgumentException();
        if (head == tail)
            return head.value;
        else {
            var current = head;
            int start = 0;
            while (current != null) {
                if (start == (count - value)) {
                    return current.value;
                }
                current = current.next;
                start++;
            }
        }
        return -1;
    }

    public int previousNode(int val) {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail)
            throw new NoSuchElementException();
        else {
            var current = head.next;
            int previous = head.value;
            while (current!= null) {
                if(current.value==val)
                return previous;
                previous = current.value;
                current = current.next;


            }
        }
       return -1;
    }

    public int nextNode(int num){
        if(isEmpty())
            throw new NoSuchElementException();
        if(head==tail)
            throw new NoSuchElementException();
        else{
            var current = head;
            int next = current.value;
            while(current!=null){
                if(current.value==num){
                    return next;
                }
                next = current.value;
                current = current.next;
            }
        }
        return -1;
    }


}



