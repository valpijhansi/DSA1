public class Main {
    public static void main(String[] args) {
        MyArray a = new MyArray(7);
        a.insert(12);
        a.insert(23);
        a.insert(15);

        a.removeAt(2);
        a.print();
        System.out.println(a.contains(23));
        a.clear();
        a.print();
        a.ensureCapacity(12);

    }
}
