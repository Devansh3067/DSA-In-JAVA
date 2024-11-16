package StackQueues.Questions;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int len = 0;
        int maxLen = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (st.isEmpty()) {
                    maxLen = Math.max(len,maxLen);
                    len = 0;
                } else{
                    st.pop();
                    len += 2;
                }
            } else {
                st.add(ch);
            }
        }
        return Math.max(len,maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(""));
        System.out.println(longestValidParentheses("())(()()))()"));
    }
}
