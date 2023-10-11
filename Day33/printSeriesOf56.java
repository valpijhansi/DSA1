import java.util.ArrayDeque;
import java.util.Queue;

public class printSeriesOf56 {
    public static void main(String[] args) {

     PrintSeriesOf56(5);
    }
   static void PrintSeriesOf56(int n){
       Queue<String> queue = new ArrayDeque<>();
       queue.add("5");
       queue.add("6");
       for (int i = 0; i < n; i++) {
           String temp = queue.remove();
           System.out.print(temp+" ");
           queue.add(temp+"5");
           queue.add(temp+"6");

       }
   }
}
