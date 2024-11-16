package LeetCode75;

import java.util.Arrays;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int f = 0;
        int l = ch.length - 1;
        while (f < l) {
            if (vowels.indexOf(ch[f]) != -1 && vowels.indexOf(ch[l]) != -1) {
                char temp = ch[f];
                ch[f] = ch[l];
                ch[l] = temp;
                f++;
                l--;
            } else if (vowels.indexOf(ch[f]) != -1) {
                l--;
            } else if (vowels.indexOf(ch[l]) != -1) {
                f++;
            } else {
                f++;
                l--;
            }
        }
        StringBuilder st = new StringBuilder();
        for (char c : ch) {
            st.append(c);
        }
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }
}
