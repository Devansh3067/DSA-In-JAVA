package Array.BinarySearch;

// * Medium

/*You are given an m x n integer matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/

//* If the matrix is not strictly sorted...

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,38,50}};
        int target = 11;
        int row = 0;
        int found = -1;
        int col = nums[0].length -1;
        while(row < nums.length && col >= 0){
            if(target > nums[row][col]) row++;
            else if(target < nums[row][col]) col--;
            else {
                found = 1;
                break;
            }
        }
        if(found == 1){
            System.out.println("Number found at [" + row + "," + col + "]");
        }
        else {
            System.out.println("Number not found");
        }
    }
}
