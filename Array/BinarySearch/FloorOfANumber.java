package Array.BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 23, 25, 26, 29, 33, 46, 59};
        int target = 24;
        int floor;

        int lower = 0;
        int upper = arr.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if(arr[mid] == target){
                floor = arr[mid];
                System.out.println("The floor = " + floor);
                return;
            }
            else if(arr[mid]>target){
                upper = mid -1;
            }
            else{
                lower = lower+1;
            }
        }

        System.out.println("The floor = " + arr[upper]);
    }
}
