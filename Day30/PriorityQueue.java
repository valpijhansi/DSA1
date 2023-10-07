import java.util.PriorityQueue;
class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(12);
        priorityQueue.add(4);
        priorityQueue.add(5);
        System.out.println(priorityQueue);

        var front = priorityQueue.remove();
        System.out.println(front);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue.size());
    }

}
