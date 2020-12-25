package practice;

import ds.stack.Stack;

public class Length_of_the_longest_valid_substring {
    public static void main(String[] args) {
        // String str = "((()";
        String str = "()(()))))";
        System.out.println(FindLength(str));
    }

    public static int FindLength(String str) {
        Stack stk = new Stack();
        int len = str.length();
        stk.push(-1);

        int result = 0;
        for (int i = 0; i < len; i++) {

            //push index of open bracket to the stack
            if (str.charAt(i) == '(') {
                stk.push(i);

                // if not open bracket and stack is not empty also pop index of last open bracket
            } else if (!stk.isEmpty()) {
                stk.pop();

                //after last pop if stack is still not empty get the peek

                //calculate the result by taking max of last result and (diff of last open index to the peek)
                // this is to check the scenario if stack became empty after the pop
                if (!stk.isEmpty()) {
                    int peek = stk.peek();
                    result = Math.max(result, i - peek);
                }
            } else
                stk.push(i);

        }
        return result;

    }
}
