package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] array = {23, 43, 53, 55, 65, 73, 82, 91};
        int target = 53;
        System.out.println(binarySearch(array, target, 0, array.length));
    }

    private static boolean binarySearch(int[] array, int target, int start, int end) {
        if(start > end) return false;
        int mid = start + (end - start) / 2;
        if (array[mid] == target) return true;
        else if (array[mid] > target) return binarySearch(array, target, start, mid - 1);
        else return binarySearch(array, target, mid + 1, end);
    }
}
