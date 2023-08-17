public class ArrayOperations {
   private int items[];
    public ArrayOperations(int size){
        items = new int[size];
    }
     private int count = 0;
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
    void print(){
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]);
        }
    }
}
