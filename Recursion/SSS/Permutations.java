package Recursion.SSS;

import java.util.ArrayList;

public class Permutations {

    public static ArrayList<String> findPermutations(String perm, String str) {
        if (str.isEmpty()) {
            ArrayList<String> perms = new ArrayList<>();
            perms.add(perm);
            return perms;
        }
        char ch = str.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i <= perm.length(); i++) {
            answer.addAll(findPermutations(perm.substring(0, i) + ch + perm.substring(i), str.substring(1)));
        }
        return answer;
    }

    public static int noOfPermutations(String perm, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        int answer = 0;
        for (int i = 0; i <= perm.length(); i++) {
            answer = answer + noOfPermutations(perm.substring(0, i) + ch + perm.substring(i), str.substring(1));
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findPermutations("", str));
        System.out.println(noOfPermutations("", str));
    }
}
