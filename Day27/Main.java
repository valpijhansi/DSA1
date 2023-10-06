public class Main {
    public static void main(String[] args) {
        StackOperations stack = new StackOperations();
         stack.push(12);
         stack.push(17);
         stack.push(11);
         stack.push(4);
         stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
