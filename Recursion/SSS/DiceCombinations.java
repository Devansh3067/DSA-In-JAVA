package Recursion.SSS;

import java.util.ArrayList;

//In this we find all the combinations of the numbers on the dice that add up to the given target number.
public class DiceCombinations {

    public static ArrayList<Integer> findCombinations(int comb, int target) {
        if (target == 0) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(comb);
            return ans;
        }
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            answers.addAll(findCombinations(comb * 10 + i, target - i));
        }
        return answers;
    }

    public static void findCombinations2(int comb, int target) {
        if (target == 0) {
            System.out.println(comb);
            return;
        }
        for (int i = 1; i <= target; i++) {
            findCombinations2(comb * 10 + i, target - i);
        }
    }

    public static int findCombinationsCount(int comb, int target) {
        if (target == 0) {
            return 1;
        }
        int answers = 0;
        for (int i = 1; i <= target; i++) {
            answers += findCombinationsCount(comb * 10 + i, target - i);
        }
        return answers;
    }


    public static void main(String[] args) {
        int target = 6;
        System.out.println(findCombinations(0, target));
        System.out.println(findCombinationsCount(0, target));
//        findCombinations2(0, target);
    }
}
