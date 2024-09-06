package Array.BinarySearch;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public static boolean isPossibleAns(int[] position,int m,int mid){
        int prev = position[0]; // prev stores the position of previously added ball.
        m--;
        for (int j : position) {
            if (j - prev >= mid) {
                m--; // A new ball is placed therefore no of balls left to be placed is reduced.
                prev = j; //update the position.
            }
            if (m == 0) return true;
        }
        return false;
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        if(m == 2) return position[position.length - 1] - position[0];
        int start = 1;
        int end = position[position.length - 1] - position[0];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isPossibleAns(position,m,mid)){
                ans = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3; // No of balls
        System.out.println("The time taken to complete each chapter : " + Arrays.toString(position));
        int answer = maxDistance(position,m);
        System.out.println("The minimum possible maximum time : " + answer);
    }
}
