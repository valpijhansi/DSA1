import java.util.LinkedList;
public class LinkedListMethods {





        public static void main(String[] args) {

            LinkedList<Integer> list = new LinkedList<>();

            list.add(23);
            list.add(89);
            list.add(40);
            list.add(22);
            list.add(23);

            list.addFirst(44);
            list.addLast(90);

            System.out.println(list);



            list.remove(3);
            list.removeFirst();
            list.removeLast();

            System.out.println();

            System.out.println(list);
            list.removeFirstOccurrence(23);
            list.removeLastOccurrence(89);
            System.out.println(list.size());
            System.out.println(list.indexOf(22));
            System.out.println(list.contains(22));

            System.out.println(list);
            list.clear();
            System.out.println(list);
        }

    }

