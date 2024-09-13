package Recursion.Arrays;

import java.util.Arrays;

public class XORQueriesOfASubArray {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int i = 0;
        for (int[] array : queries) {
            int ans = 0;
            for(int j = array[0] ; j <= array[1];j++){
                ans =  ans ^ arr[j];
            }
            answer[i++] = ans;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {16};
        int[][] queries = {{2,3},{1,3},{0,0},{0,3}};
        System.out.println(Arrays.toString(xorQueries(array, queries)));
    }
}
