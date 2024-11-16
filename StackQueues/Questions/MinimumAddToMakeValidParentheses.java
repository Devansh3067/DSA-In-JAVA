package StackQueues.Questions;
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

import java.util.Stack;

/**
 * A parentheses string is valid if and only if:
 * <p>
 * It is the empty string,
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
 * <p>
 * For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
 * Return the minimum number of moves required to make s valid.
 */

public class MinimumAddToMakeValidParentheses {
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.add(ch);
                }
            } else {
                st.add(ch);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("((())())(()"));
        System.out.println(minAddToMakeValid("(((()())()("));
        System.out.println(minAddToMakeValid(")("));
        System.out.println(minAddToMakeValid("()"));
        System.out.println(minAddToMakeValid(")()"));
    }
}
