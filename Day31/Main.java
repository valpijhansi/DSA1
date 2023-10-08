public class Main {
    public static void main(String[] args) {
        queueWithLinkedList queue = new queueWithLinkedList();

        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(16);
        queue.enqueue(19);
        queue.enqueue(20);

        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }
}
