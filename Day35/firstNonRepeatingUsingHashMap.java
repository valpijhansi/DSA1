import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class firstNonRepeatingUsingHashMap {
    public static void main(String[] args) {
        char res = firstNonRepeatingCharacter("rock the world");
        System.out.println(res);
        char ans = firstRepeatingCharacter("Hello Lokesh");
        System.out.println(ans);
    }
    public static char firstNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(var ch:str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                int count = map.get(ch);
                map.put(ch,count+1);
            }
        }
        for(var ch : str.toCharArray()){
            if(map.get(ch)==1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
    public static char firstRepeatingCharacter(String str) {
        Set<Character> set = new HashSet<>();
        for(var x : str.toCharArray()){
            if(set.contains(x))
                return x;
        }
        return  Character.MIN_VALUE;
    }
}
