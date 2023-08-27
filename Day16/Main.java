public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addFirst(35);
        list.addAtIndex(2,40);
        LinkedList.createLoop();
       list.addAtIndex(0,45);
        list.print();
        System.out.println(list.detectLoop());
    }
}
