package StackQueues.Questions;

//? https://www.naukri.com/code360/problems/next-smaller-element_1112581?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0%3Fsource%3Dyoutube&campaign=Lovebabbarcodestudio

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * You are given an array 'ARR' of integers of length N. Your task is to find the next smaller element for each of the array elements.
 * <p>
 * The Next Smaller Element for an array element is the first element to the right of that element, which has a value strictly smaller than that element.
 * <p>
 * If for any array element the next smaller element does not exist, you should print -1 for that array element.
 * <p>
 * For Example:
 * <p>
 * If the given array is [ 2, 3, 1], we need to return [1, 1, -1]. Because for 2, 1 is the Next Smaller element. For 3, 1 is the Next Smaller element and for 1, there is no next smaller element, hence the answer for this element is -1.
 */

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        // Write your code here.
        ArrayList<Integer> pos = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        for (int i = n - 1; i >= 0; i--) {
            while (arr.get(i) <= stack.peek()) {
                stack.pop();
            }
            pos.add(stack.peek());
            stack.add(arr.get(i));
        }
        Collections.reverse(pos);
        return pos;
    }

    static ArrayList<Integer> prevSmallerElement(ArrayList<Integer> arr, int n) {
        // Write your code here.
        ArrayList<Integer> pos = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        for (int i = 0; i < n; i++) {
            while (arr.get(i) <= stack.peek()) {
                stack.pop();
            }
            pos.add(stack.peek());
            stack.add(arr.get(i));
        }
        return pos;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        System.out.println("Answer for next smaller= " + nextSmallerElement(arr, arr.toArray().length));
        System.out.println("Answer for prev smaller= " + prevSmallerElement(arr, arr.toArray().length));
    }
}
