import java.util.Arrays;

public class ArrayOperations {
   private int items[];
    public ArrayOperations(int size){
        items = new int[size];
    }
     private int count = 0;

    public ArrayOperations(){
        items = new int[20];
    }

    public void ensureCapacity(int minElements){
        int i = items.length;
        while(i<minElements){
            i *= 2;
            items = new int[i];
        }
        for(var X:items)
        System.out.print(X+" ");
    }


    void insert(int value) {
        //if array is full, resize the array
        if (items.length == count) {
             int items1[] = new int[count * 2];
             for(int i=0;i<count;i++){
                 items1[i] = items[i];
             }
             items = items1;
        }
        items[count++] = value;
    }


    void removeAt(int index){
        if(index<0 || index>=count){
            throw  new IllegalArgumentException();
        }
        for(int i=index;i<count;i++){
            items[i] = items[i+1];

        }
        count--;
    }


    int indexOf(int value){
        for (int i = 0; i < count; i++) {
            if(items[i]==value)
                return i;

        }
        return -1;
    }



    boolean contains(int value){
        for(int i=0;i<count;i++){
            if (items[i]==value)
                return true;
        }
        return false;
    }


    int firstIndexOf(int value){
        for(int i=0;i<count;i++){
            if(items[i]==value)
                return i;

        }
        return -1;
    }



    int lastIndexOf(int value){
        for(int i=count-1;i>-1;i--){
            if(items[i]==value)
                return i;
        }
        return -1;
    }

    int size(){
        return count;
    }
    int x = 0;
    boolean hasNext(){

        return x!=count;
    }
    int next(){
        return items[x++];
    }

    void clear(){
        count = 0;
    }


    int[] toArray(){
        int tempItem[] = new int[count];
        for(int i=0;i<count;i++){
            tempItem[i] = items[i];
        }
        return tempItem;
    }


    public void trimSize(){
        int[] newArray = new int[count];
        for(int i=0;i<count;i++){
            newArray[i] = items[i];
            items = newArray;
        }
    }
    void subList(int start,int end){
        if(start<0 || start>=count)
            throw  new IllegalArgumentException();
        else if(!(end>=start && end<=count))
            throw new IllegalArgumentException();
        if(start==end){
            System.out.println("[]");
            return;
        }
        int temp[] = new int[end-start];
        for (int i = start; i < end ; i++) {
            temp[i] = items[i];

        }
    }


    void print(){
        for(int i=0;i<items.length;i++){
            System.out.print(items[i]);
        }
    }


    void sort() {

        int items1[] = Arrays.copyOf(items,count);
        Arrays.sort(items1);

        for(int i=0;i<count;i++)
            items[i]=items1[i];


    }

    boolean isEmpty() {
        return count == 0;
    }


    public void middleElement(){
        if(items.length%2==0){
            System.out.println("Middle elements are:");
            int m1 = items[items.length/2-1];
            System.out.println(m1);
            int m2 = items[items.length/2];
            System.out.println(m2);
        }
        else {
            System.out.println("Middle element is:");
            int middleElement = items[items.length/2];
            System.out.println(middleElement);
        }

   }

   public void removeIfGreater(){
       if(items.length>4) {
           int[] newArray = new int[items.length-4]; // Create a new array with a smaller length
           int newIndex = 0;

           for (int i = 0; i < items.length; i++) {
               if (i < 4) {
                   newArray[newIndex] = items[i];
                   newIndex++;
               }
           }
           items = newArray;
           for(var N:newArray)
               System.out.print(N+" ");


       }
       System.out.println();
    }

    void reverse() {
        for (int i = items.length-1; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }
         System.out.println();

    }

    public  void maxElement(){
        int max = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i]>max)
                max = items[i];

        }
        System.out.println(max);
    }


    public void MinElement(){
        int min = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i]<min)
                min = items[i];

        }
        System.out.println(min);

    }
 @Override
    public String toString() {
        return "ArrayOperations{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                ", x=" + x +
                '}';
    }
}
