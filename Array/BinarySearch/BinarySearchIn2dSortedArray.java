package Array.BinarySearch;

//This matrix is strictly sorted

public class BinarySearchIn2dSortedArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,1}};
        int target = 2;
        int start = 0;
        int noFound = 0;
        int row = 0, col = 0;
        int end = (matrix.length * matrix[0].length) - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            row = mid / matrix[0].length;
            col = Math.abs(mid - matrix[row].length * row);
            if (target > matrix[row][col]) start = mid + 1;
            else if (target < matrix[row][col]) end = mid - 1;
            else {
                noFound = 1;
                break;
            }
        }
        if (noFound == 1) {
            System.out.println("Number found at [" + row + "," + col + "]");
        } else {
            System.out.println("Number not found");
        }
    }
}
