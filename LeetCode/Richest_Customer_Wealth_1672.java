package LeetCode;

public class Richest_Customer_Wealth_1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 1;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Richest_Customer_Wealth_1672 obj = new Richest_Customer_Wealth_1672();

        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};


        int max = obj.maximumWealth(arr);
        System.out.println("The Maximum Wealth is : " + max);
    }
}
