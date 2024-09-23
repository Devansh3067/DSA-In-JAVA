package Recursion.SSS;

import java.util.ArrayList;
import java.util.Objects;

public class LetterCombinationsOfAPhoneNumber {

    private static ArrayList<String> findCombinations(String[] letters, String comb, String digits) {
        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(comb);
            return list;
        }
        int digit = digits.charAt(0) - 48;
        String str = letters[digit];

        ArrayList<String> answers = new ArrayList<>();
        for (char word : str.toCharArray()) {
            answers.addAll(findCombinations(letters, comb + word, digits.substring(1)));
        }
        return answers;
    }

    private static int findCombinationsCount(String[] letters, String comb, String digits) {
        if (digits.isEmpty()) {
            return 1;
        }
        int digit = digits.charAt(0) - 48;
        String str = letters[digit];

        int answers = 0;
        for (char word : str.toCharArray()) {
            answers += findCombinationsCount(letters, comb + word, digits.substring(1));
        }
        return answers;
    }

    public static ArrayList<String> letterCombinations(String digits) {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        System.out.println(findCombinationsCount(letters, "", digits));
        return findCombinations(letters, "", digits);
    }

    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }
}
