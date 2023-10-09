public class Main {
    public static void main(String[] args) {
        stackWithTwoQueues stack = new stackWithTwoQueues();

        stack.push(23);
        stack.push(25);
        stack.push(12);
        stack.push(13);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
