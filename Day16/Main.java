public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.createLoop();
        System.out.println(list.detectLoop());
    }
}
