public class Main1 {
    public static void main(String[] args) {
        PalindromeUsingStack stack = new PalindromeUsingStack();
        stack.push(1241);
        System.out.println(stack.isPalindrome());
        stack.push(1771);
        System.out.println(stack.isPalindrome());
    }
}
