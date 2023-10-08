import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        queue.add(30);
        queue.add(60);
        System.out.println(queue);
        reverseKitems(queue,3);
        System.out.println(queue);

    }
    public static void reverseKitems(Queue<Integer> queue,int k) {
        if(k<0||k>queue.size())
            throw new IllegalStateException();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k ; i++)
            stack.push(queue.remove());
           while(!stack.isEmpty())
               queue.add(stack.pop());
           for(int i=0;i<queue.size()-k;i++)
               queue.add(queue.remove());

    }

}
