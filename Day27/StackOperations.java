import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackOperations {

    Node top;

    private int size = 0;

    public class Node {
        private Node next;
        int value;

        private Node(int item) {
            this.value = item;
        }
    }
     boolean isEmpty(){
           return  top == null;

     }
        public void addFirst(int item){
            var node = new Node(item);
            if(isEmpty()){
                top = node;
            }else  {
                node.next = top;
                top = node;
            }
            size++;
        }
        public void push(int item){
            addFirst(item);
        }

        public void removeFirst(){
            if(isEmpty()){
                throw new NoSuchElementException();
            }
            if(top.next==null){
                System.out.println(top.value);
                top = null;
            }else {
                System.out.println(top.value);
                var temp = top.next;
                top.next = null;
                top = temp;
            }
            size--;
        }
        public void pop(){
            removeFirst();
        }
        public int peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return top.value;
        }
        public int size(){
            return size;
        }
    }

