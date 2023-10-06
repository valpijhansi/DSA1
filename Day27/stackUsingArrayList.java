import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.concurrent.ArrayBlockingQueue;

class Stack1 {

    ArrayList<Integer> list = new ArrayList<>();

    public void push(int item) {

        list.add(item);
    }

    public int pop() {

        if(list.isEmpty())
            throw new EmptyStackException();
        var top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;


    }

    public int peek() {

        if(list.isEmpty())
            throw new EmptyStackException();
        return list.get(list.size()-1);
    }


    public boolean value(int value) {

        if(list.isEmpty())
            throw new EmptyStackException();
        return list.contains(value);

    }

    public boolean findValue(int item) {

        if(list.isEmpty())
            throw new EmptyStackException();
        var top= list.size()-1;

        while(top>=0) {

            if(list.get(top)==item)
                return true;

            top--;

        }

        return false;
    }

    public void index(int item) {

        if(list.isEmpty())
            throw new EmptyStackException();
        var top = list.size()-1;
        while(top>=0) {

            if(list.get(top)==item) {
                System.out.println(top);
                return;
            }
            top--;

        }

        System.out.println(-1);

    }
}
