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
            head = node;
        }else {
            var current = head;
            if(value> current.value){
                addNext(value);
            }else {
                addUp(value);
            }
        }

    }


}