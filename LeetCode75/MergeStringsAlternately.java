package LeetCode75;

//? https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

/**You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.*/

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for(int i = 0 ; i< max; i++){
            if(i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i < word2.length()){
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcs","pq"));
    }
}
