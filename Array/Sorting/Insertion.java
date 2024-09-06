package Array.Sorting;

import java.util.Arrays;

/*In this we make two parts of the array one is sorted and other is not sorted
Initially the size of sorted array is 1
The outer loop goes from 0 to size - 2 . It represents the whole array.
And the loop j represents the sorted array
j starts from i + 1 and goes till zero ... if the element on the left is smaller than jth element then it swaps
if not then break ... we do not need to check further*/
public class Insertion {
    void InsertionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                else break; //* Here, this algorithm becomes better than the bubble... both have same time C but as the insertion sort creates a sorted array on the left thus we can break if the left element is smaller as if the left element is smaller so the other elements on the left will also be smaller. It reduces the no of checks.
            }
        }
    }

    public static void main(String[] args) {
        Insertion obj = new Insertion();
        int[] array = {1,-3,4,2,2,3,52,-4,2,34,-56,3,4,2};
        obj.InsertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
