package Recursion.Arrays;

import java.util.ArrayList;


//Search for multiple occurrences

public class LinearSearchII {
    public static ArrayList<Integer> linear(int[] num, int idx, int target, ArrayList<Integer> list) {
        if (idx == num.length) return list;
        if (num[idx] == target) list.add(idx);
        return linear(num, idx + 1, target, list);
    }

    public static ArrayList<Integer> linear2(int[] num, int idx, int target) {
        ArrayList<Integer> list = new ArrayList<>(1);
        if (idx == num.length) return list;
        if (num[idx] == target) list.add(idx);
        ArrayList<Integer> answerFromOtherCalls = linear2(num, idx + 1, target);
        list.addAll(answerFromOtherCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 12, 12, 1, 14, 12, 3, 24, 5, 12};
        int target = 12;
        ArrayList<Integer> list = new ArrayList<>(1);
//        System.out.println(linear(num, 0, target, list));
        System.out.println(linear2(num, 0, target));
    }
}
