public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(12);
        list.addFirst(13);
        list.addLast(10);
        list.addLast(40);

        System.out.println(list.valueOf(2));
        System.out.println(list.getIndex(40));
    }
}
