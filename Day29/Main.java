public class Main {
    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(12);
        queue.enqueue(45);
        queue.enqueue(23);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
