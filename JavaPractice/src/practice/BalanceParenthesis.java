package practice;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Algorithm:
 * <p>
 * Declare a character stack S.
 * Now traverse the expression string exp.
 * If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
 * If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and
 * if the popped character is the matching starting bracket then fine else brackets are not balanced.
 * After complete traversal, if there is some starting bracket left in stack then “not balanced”
 */
public class BalanceParenthesis {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        if (findBalanceParenthesis(str))
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }

    public static boolean findBalanceParenthesis(String str) {
        int len = str.length();
        int count = 0;

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            char x = str.charAt(i);

            // If current char is opening bracket then push it to the stack
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }

            // Now check If current char is not opening bracket

            // then stack should not empty
            if (stack.isEmpty()) {
                return false;
            }

            // check all the cases for pop

            char check;
            switch (x) {
                //if next char from the string is '}' but pop up from the stack is different opening bracket
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;

                //if next char from the string is ']' but pop up from the stack is different opening bracket
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;

                //if next char from the string is ']' but pop up from the stack is different opening bracket
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());

    }
}
