package Array.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        //We are given a sorted array, and also we are given a target number, and we are told to find the smallest number that is greater than the target number...
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 23, 25, 26, 29, 33, 46, 59};
        int target = 33;
        int ceil = 0;
        int ceilFlag = 0;
//        for(int elem : arr){
//            if(elem>=target){
//                ceil = elem;
//                break;
//            }
//        }

        //Using Binary Search...
        int lower = 0;
        int upper = arr.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (target == arr[mid]) {
                ceil = arr[mid];
                ceilFlag = 1;
                break;
            } else if (target < arr[mid]) upper = mid - 1;
            else lower = mid + 1;
        }
        System.out.println((ceilFlag == 0) ? arr[lower] : ceil);
    }
}
