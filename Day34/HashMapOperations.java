import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"orange");
        map.put(3,"Grapes");
        map.put(4,"Papaya");
        map.put(null,"Lokesh");
        System.out.println(map);

        map.remove(3);
        System.out.println(map);
        System.out.println(map.containsValue(3));
        System.out.println(map.containsValue("Apple"));
        System.out.println(map.get(null));
        System.out.println(map.get(2));

        for(var x: map.keySet()){
            System.out.println(x);
        }
        for(var x : map.values()){
            System.out.println(x);
        }
        for( var x: map.entrySet()){
            System.out.println(x);
        }
    }
}
