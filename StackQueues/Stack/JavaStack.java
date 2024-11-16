package StackQueues.Stack;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(20);
        st.add(30);
        st.add(30);
        st.add(30);
        st.add(50);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
    }
}
