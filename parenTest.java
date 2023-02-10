import java.util.Stack;

public class parenTest {
    public static void main(String[] args) {
        String paren = "((";

        System.out.println(isValid(paren));

    }

    public static boolean isValid(String paren) {
        if (paren.length() % 2 !=0) {// if odd length then false;
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < paren.length(); i++) {
            if (paren.charAt(i) == '(') {
                stack.push(')');
            } else if (paren.charAt(i) == ('{')) {
                stack.push('}');
            } else if (paren.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != paren.charAt(i)) {
                return false;
            }
        }
        return stack.isEmpty();

    }
}
