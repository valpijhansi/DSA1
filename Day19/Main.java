public class Main {
    public static void main(String[] args) {
        cirularLinkedListMethods cl = new cirularLinkedListMethods();
        cl.addFirstOptimized(20);
        cl.print();
        cl.addFirstOptimized(30);
        cl.print();
        cl.addFirstOptimized(40);
        cl.print();

        cl.addLastOptimized(50);
        cl.print();
        cl.addLastOptimized(60);
        cl.print();
    }
}
