public class Main {
    public static void main(String[] args) {
        doublyLinkedList dl = new doublyLinkedList();
       // int a[] = {12,36,35};
        dl.addLast(20);
        dl.addFirst(40);
        dl.addLast(30);
        dl.addLast(50);
        dl.addAtIndex(0,70);

        int a[] = {12,13,14};
        //int b[] = {13,14,15};
        dl.addManyAtLast(a);

        dl.print();

        dl.removeFirst();

        dl.addManyAtFirst(a);
        dl.print();

    }
}
