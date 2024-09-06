package Array.BinarySearch;

public class BinarySearch {

    void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        int[] arr = {2, 3, 4, 4, 5, 2, 2, 3, 3, 5, 6, 7, 7, 2};
        obj.sort(arr);

        int target = 5;

        int lower = 0;
        int upper = arr.length - 1;
        boolean noFound = false;
        while (lower <= upper) {
            int mid_value = (lower + upper) / 2;
            if (target > arr[mid_value]) lower = mid_value + 1;
            else if (target < arr[mid_value]) upper = mid_value - 1;
            else{
                noFound = true;
                break;
            }
        }
        if(noFound) {
            System.out.println("\nNumber Found.");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
