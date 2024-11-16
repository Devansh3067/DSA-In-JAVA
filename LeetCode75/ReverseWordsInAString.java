package LeetCode75;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] tokens = s.trim().split("\\s+");
        int f = 0;
        int l = tokens.length-1;
        while (f < l) {
            String temp = tokens[f];
            tokens[f] = tokens[l];
            tokens[l] = temp;

            f++;
            l--;
        }
        StringBuilder ans = new StringBuilder();
        for (String str : tokens){
            str = str.trim();
            ans.append(str).append(" ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the        sky is blue"));
        System.out.println(reverseWords("the sky is blue"));

        System.out.println("Hello        ".trim());
    }

}
