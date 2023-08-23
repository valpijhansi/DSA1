public class LinkedList {
    class Node{
        private int value;
        Node(int Value){
            this.value = value;
        }
      private Node next;
    }
    Node head;
    Node tail;
    void addFirst(int item){
        var node =new Node(item);
        if(head==null){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    void addLast(int item){
        var node = new Node(item);
        if(head==null){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    int valueOf(int index){
        var current = head;
        int start = 0;
        while(current.next!=null){
            if(start==index)
                return current.value;
            current = current.next;
            start++;
        }
        return -1;
    }

    int getIndex(int value){
        int start = 0;
        var current = head;
        while(current!=null){
            if(current.value == value)
                return  start;
        }
        return -1;
    }

    boolean contains(int value){
        return getIndex(value)!=-1;
    }

}
