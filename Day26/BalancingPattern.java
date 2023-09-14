import java.util.Stack;

public class BalancingPattern {

    public static void main(String[] args) {

        String str="[{())}]"; //([{}])
        System.out.println(isBalanced(str));
        
    }
    
    static boolean isBalanced(String str) {

        Stack<Character> stack=new Stack<>();

        for(var ch: str.toCharArray()) {

            if(ch=='(' || ch=='<' || ch=='{' || ch=='[')
              stack.push(ch);

          
            else {

                if(stack.empty())
                  return false;

               var top=stack.pop();   

               if(ch==')' && top!='(')
                 return false;

               else if(ch=='>' && top!='<') 
                  return false;

               else if(ch=='}' && top!='{')
                 return false;

               else if(ch==']' && top!='[')
                 return false;
                   
            }
        }   

    return true;
  }
}