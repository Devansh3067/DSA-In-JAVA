package LeetCode75;

//? https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75
public class ContainerWithMostWater {
    public static int maxArea(int[] h) {
        int n = h.length;
        int f = 0;
        int l = n-1;
        int maxArea = 0;
        int area;
        while(f < l){
            if(h[f]<h[l]){
                area = h[f] * (l-f);
                f++;
            } else if(h[l]<h[f]){
                area = h[l] * (l-f);
                l--;
            } else {
                area = h[l] * (l-f);
                f++;
                l--;
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {

    }
}
