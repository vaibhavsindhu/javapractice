package practice;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayDeque;
import java.util.Deque;

public class Minimum_number_of_bracket_reversals {
    public static void main(String[] args) {

        String expr = "}{{}}{{{";

        System.out.println(countMinReversals(expr));
    }

    public static int countMinReversals(String str) {
        int len = str.length();

        //return -1 if str is not even
        if (len % 2 != 0)
            return -1;

        Deque<Character> stack = new ArrayDeque();
        //push all invalid brackets to stack ..ie remove all valid brackets from the string
        for (int i = 0; i < len; i++) {
            char x = str.charAt(i);
            if (x == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(x);
            } else
                stack.push(x);
        }
        int stack_len = stack.size();

        int n = 0;

        //count open brackets
        while (!stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
            n++;
        }
        return (stack_len / 2 + n % 2);
    }
}
