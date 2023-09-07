public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addNext(20);
        list.addNext(50);
        list.addUp(40);

        list.addUpNext(30);
        list.addUpNext(15);
        list.addUpNext(3);


        list.printNextNodes();
        list.printUpNodes();
    }
}
