public class Linkedlist {
    Node head;
    class Node {
        int value;
        Node up;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }


    void addNext(int value) {
        var node = new Node(value);
        if(head==null) {
            head=node;
        } else {
            var current = head;
            while(current.next !=null)
                current = current.next;
            current.next = node;
        }
    }
    void addUp(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
        } else {
            var current = head;
            while(current.up !=null)
                current = current.up;
            current.up = node;
        }
    }
    public void printNextNodes() {
        var current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void printUpNodes() {
        var current = head;
        while (current != null){
            System.out.println(current.value);
            current= current.up;
        }
    }

    public void addUpNext(int value){
        var node = new Node(value);
        if(head==null){
            addNext(value);
            return;
        }
        var current = head;
        while(current!=null){
            if(current.value>value){
                if(current.up==null){
                    current.up = new Node(value);
                    return;
                }
                current = current.up;
            }else {
                if(current.next==null){
                    current.next = new Node(value);
                    return;
                }
                current = current.next;
            }
        }

    }

    public boolean search(int key){
        if(head==null){
            throw new IllegalStateException();
        }else{
            var current = head;
            while(current!=null){
                if(current.value==key)
                    return true;


            }
            current = current.next;
        }
        return false;
    }

    


}