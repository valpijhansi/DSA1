public class Main {
    public static void main(String[] args) {
        ArrayOperations a = new ArrayOperations(4);
        a.insert(12);
        a.insert(20);
        a.insert(45);
        a.removeAt(2);
        System.out.println(a.firstIndexOf(12));
        System.out.println(a.lastIndexOf(20));
        System.out.println(a.contains(12));
        a.print();
    }
}
