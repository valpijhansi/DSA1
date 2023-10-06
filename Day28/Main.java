public class Main {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque(3);
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(16);
       // queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
