package StackQueues.Questions;

import java.util.Stack;

//? https://leetcode.com/problems/valid-parentheses/description/
/** Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char popped = st.pop();
                if (!((ch == ')' && popped == '(') || (ch == '}' && popped == '{' || (ch == ']' && popped == '[')))){
                    return false;
                }
            } else{
                st.add(ch);
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("({[}])"));
    }
}
