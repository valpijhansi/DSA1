import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        int arr[] = {1,0,4,6,5,5,3,3,2,7,8,9,10};
        Set<Integer> set =new HashSet<>();
        for(var x : arr)
            set.add(x);

        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.isEmpty());
        System.out.println(set.equals(11));
        System.out.println(set.size());

        set.remove(3);
        System.out.println(set);
    }
}
