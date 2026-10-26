import java.util.Stack;

public class Parentheses {

    public static boolean isBalanced(String givenString) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < givenString.length(); i++) {
            char ch = givenString.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if ((ch == ')' && open != '(') ||
                        (ch == ']' && open != '[') ||
                        (ch == '}' && open != '{')) {
                    return false;
                }
            }
        }

        // All opening brackets must be matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}{[()()]()}"));
        System.out.println(isBalanced("[(])"));
    }
}
