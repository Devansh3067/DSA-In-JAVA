package Array.Sorting;

import java.util.Arrays;

/*In this sorting technique in every iteration we calculate the max(or min) element in the non-sorted array
And we send the max(or min) element to its correct place and the decrease the array...*/

public class Selection {

    void selectionSort(int[] array) {
        int temp;
        for (int i = 1; i <= array.length - 1; i++) {
            int last = array.length - i;
            //first find the max
            int max = findMax(array, 0, last); // This function gives the index of the max number.
            //Now swap the max element with the last element...
            {
                temp = array[max];
                array[max] = array[last];
                array[last] = temp;
            }
        }
    }

    int findMax(int[] array, int start, int last) {
        int max = array[start];
        int maxIndex = 0;
        for (int i = start + 1; i <= last; i++) {
            if(max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Selection obj = new Selection();
        int[] array = {3, 1, 5, 4, 2};
        obj.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
