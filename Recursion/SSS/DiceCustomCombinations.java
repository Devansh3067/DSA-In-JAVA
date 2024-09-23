package Recursion.SSS;

import java.util.ArrayList;

//In this we find all the combinations of the numbers on the dice that add up to the given target number.
public class DiceCustomCombinations {

    public static ArrayList<Integer> findCombinations(int comb, int target, int[] custom) {
        if (target == 0) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(comb);
            return ans;
        }
        ArrayList<Integer> answers = new ArrayList<>();
        for (int elem : custom) {
            if(elem > target){
                break;
            }
            answers.addAll(findCombinations(comb * 10 + elem, target - elem, custom));
        }
        return answers;
    }

    public static void findCombinations2(int comb, int target,int[] custom) {
        if (target == 0) {
            System.out.println(comb);
            return;
        }
        for (int elem : custom) {
            if(elem > target){
                break;
            }
            findCombinations2(comb * 10 + elem, target - elem,custom);
        }
    }

    public static int findCombinationsCount(int comb, int target, int[] custom) {
        if (target == 0) {
            return 1;
        }
        int answers = 0;
        for (int elem : custom) {
            if(elem > target){
                break;
            }
            answers += findCombinationsCount(comb * 10 + elem, target - elem,custom);
        }
        return answers;
    }


    public static void main(String[] args) {
        int target = 6;
        int[] custom = {2, 4, 6, 8, 10, 12};

        System.out.println(findCombinations(0, target, custom));
        System.out.println(findCombinationsCount(0, target, custom));
//        findCombinations2(0, target);
    }
}
