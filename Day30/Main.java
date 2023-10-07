public class Main {
    public static void main(String[] args) {
        priorityQueueOperations priorityQueue = new priorityQueueOperations();
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(7);
        priorityQueue.enqueue(6);
        priorityQueue.enqueue(9);


        System.out.println(priorityQueue);

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.dequeque());

            System.out.println(priorityQueue);



        }
    }
}
