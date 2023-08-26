
import java.util.NoSuchElementException;

 class LinkedList {
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
      public void removeByIndex(int index){
         if(index>=size()||index<0)
             throw new IllegalArgumentException();
         int start = 0;
         var current = head;
         while(current!=null){
             if(start==index-1)
                 break;
             current = current.next;
             start++;
         }
         current=current.next;
      }
      public void getKthLastNode (int k) {
          var first = head;
          var second = head;
          for (int i = 0; i < k - 1; i++) {
              second = second.next;
              if (second == tail)
                  throw new IllegalArgumentException();
          }
          while (second!=tail){
              first = first.next;
              second = second.next;

          }
          System.out.println(first.value);
      }
      static LinkedList createLoop(){
         var list = new LinkedList();
         list.addLast(12);
         list.addLast(18);
         list.addLast(10);
         list.addLast(40);

         var back = list.tail;
         list.addLast(15);
         list.addLast(15);
         return list;
      }

      boolean detectLoop(){
         var slow = head;
         var fast = head;
         while (fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;

             if(slow==fast)
                 return true;
         }
          return false;
      }


 }