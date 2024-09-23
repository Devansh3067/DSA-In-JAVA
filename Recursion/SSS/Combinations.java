package Recursion.SSS;

import java.util.ArrayList;

public class Combinations {

    public static void findCombinationsI(String str, String comb, ArrayList<String> combinations) {
        if (str.isEmpty()) {
            combinations.add(comb);
            return;
        }
        findCombinationsI(str.substring(1), comb + str.charAt(0), combinations);
        findCombinationsI(str.substring(1), comb, combinations);
    }

    public static ArrayList<String> findCombinationsII(String str, String comb) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(comb);
            return list;
        }
        ArrayList<String> left = findCombinationsII(str.substring(1), comb + str.charAt(0));
        ArrayList<String> right = findCombinationsII(str.substring(1), comb);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        ArrayList<String> combinations = new ArrayList<>(1);
        String str1 = "abc";
        findCombinationsI(str1, "", combinations);
        System.out.println(combinations);

        String str2 = "abc";
        System.out.println(findCombinationsII(str2, ""));
    }
}
