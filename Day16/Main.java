public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addFirst(0);
        list.addLast(0);
        //list.addAtIndex(2,40);
        LinkedList.createLoop();
      // list.addAtIndex(0,45);
        list.print();
        System.out.println(list.detectLoop());

        System.out.println(list.binToDec());
    }
}
