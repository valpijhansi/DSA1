public class Main {

    public static void main(String[] args) {
        
        stackMethods stack=new stackMethods(4);
        stack.push(4);
        stack.push(12);
        stack.push(11);
        stack.push(45);
        //stack.push(99);
        stack.display();
        System.out.println();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.pop();
        stack.display();
         stack.peek();
        System.out.println();
       
        stack.count();
    }
    
}
