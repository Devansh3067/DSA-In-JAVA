package Recursion.SSS;

import java.util.ArrayList;

public class CombinationsWithASCII {

    public static ArrayList<String> findCombinationsII(String str, String comb) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(comb);
            return list;
        }
        ArrayList<String> left = findCombinationsII(str.substring(1), comb + str.charAt(0));
        ArrayList<String> leftASCII = findCombinationsII(str.substring(1), comb + (int)str.charAt(0));
        ArrayList<String> right = findCombinationsII(str.substring(1), comb);
        left.addAll(right);
        left.addAll(leftASCII);
        return left;
    }

    public static void main(String[] args) {
        String str2 = "ab";
        System.out.println(findCombinationsII(str2, ""));
    }
}
