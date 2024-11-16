package LeetCode75;

//? https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < flowerbed.length && n != 0; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else if (flowerbed[i] == 0 && i == len - 1) {
                flowerbed[i] = 1;
                n--;
                i++;
            } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                i++;
            }
        }
        return n == 0;
    }

    public static void main(String[] args) {
        int[] fl1 = {1, 0, 0, 0, 1};
        int[] fl4 = {0, 0, 1, 0, 0};
        int[] fl5 = {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0};
        int[] fl6 = {1, 0, 0, 0, 0, 0, 1};
        int[] fl7 = {0};
        int[] fl8 = {1, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(fl1, 1)); //true
        System.out.println(canPlaceFlowers(fl1, 2)); //false
        System.out.println(canPlaceFlowers(fl4, 1)); //true
        System.out.println(canPlaceFlowers(fl5, 4)); //true
        System.out.println(canPlaceFlowers(fl6, 2)); //true
        System.out.println(canPlaceFlowers(fl7, 1)); //true
        System.out.println(canPlaceFlowers(fl8, 2)); //false
    }
}
