public class Main {
    public static void main(String[] args) {
        ArrayOperations a = new ArrayOperations(4);
        a.insert(12);
        a.insert(20);
        a.insert(45);
        a.insert(35);
        a.insert(7);
        a.insert(8);
        a.insert(10);
        a.insert(12);
        //a.removeAt(2);
        System.out.println(a.firstIndexOf(12));

        System.out.println(a.lastIndexOf(20));

        System.out.println(a.contains(12));

        System.out.println(a.hasNext());

        System.out.println(a.next());
        a.clear();
//       while(a.hasNext())
//            System.out.println("hey");


        a.print();
        a.trimSize();
        //a.subList(1,3);

        a.sort();
        System.out.println(a);
        System.out.println(a.isEmpty());
        a.middleElement();
        a.removeIfGreater();
        a.reverse();
        a.maxElement();
        a.MinElement();
        a.ensureCapacity(5);




    }
}
