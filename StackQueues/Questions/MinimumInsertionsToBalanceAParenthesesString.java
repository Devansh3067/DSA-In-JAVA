package StackQueues.Questions;

//? https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/

import java.util.Objects;
import java.util.Stack;

/**
 * Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:
 * <p>
 * Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
 * Left parenthesis '(' must go before the corresponding two consecutive right parentheses '))'.
 * In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.
 * <p>
 * For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
 * You can insert the characters '(' and ')' at any position of the string to balance it if needed.
 * <p>
 * Return the minimum number of insertions needed to make s balanced.
 */

public class MinimumInsertionsToBalanceAParenthesesString {
    public static int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if (i != s.length() - 1 && s.charAt(i+1) == ')') {
                    i++;
                    if (st.isEmpty()) {
                        counter++;
                    } else {
                        st.pop();
                    }
                } else {
                    counter++;
                    if (!st.isEmpty()) {
                        st.pop();
                    } else{
                        counter++;
                    }
                }
            } else {
                st.add(ch);
            }
        }
        return counter + 2 * st.size();
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()()(()))"));
        System.out.println(minInsertions("("));
        System.out.println(minInsertions(")))))))"));
    }
}
