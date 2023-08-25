public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addFirst(20);
        list.addFirst(15);
        list.addLast(20);
        list.addFirst(10);
        list.addLast(23);

        System.out.println(list.size());
        System.out.println(list.MiddleNode());
        System.out.println(list.NthNode(4));
        System.out.println(list.previousNode(23));
        System.out.println(list.nextNode(12));

    }
}
