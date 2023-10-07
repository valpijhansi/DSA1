import java.util.Arrays;

public class priorityQueueOperations {
  private int items[] = new int[5];
  private int count;
  public void enqueue(int item) {
      shiftItems(item);

  }

    private void shiftItems(int item) {
        int i;
        for( i = count-1;i>=0;i--) {
            if(items[i]> item) {
                items[i+1] = items[i];
            }else {
                break;
            }
        }
        items[i+1] = item;
        count++;
    }

    public boolean isFull(){
      return count == items.length;

  }
  public boolean isEmpty(){
      return count == 0;
  }

  public int dequeque() {
      return removeFirst();
  }

    private int removeFirst() {
        if(isEmpty())
            throw  new IllegalStateException();
        var front = items[--count];
        items[count] = 0;
        return front;
    }

    public int size(){
      return count;
  }



    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
