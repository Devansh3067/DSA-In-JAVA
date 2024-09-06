package Array.Sorting;

import java.util.Arrays;


/*
This sort only works if the elements of the array are in the range 1 to N where N = length of the array
Time C for worst case is O(N)
*/
public class Cyclic {
    public static void main(String[] args) {
        Cyclic obj = new Cyclic();
        int[] array = {3, 1, 5, 4, 2};
        obj.cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    void cyclicSort(int[] array) {
        int i = 0;
        int temp;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if(array[i] != array[correctIndex]) {
                temp = array[i];
                array[i] = array[correctIndex];
                array[correctIndex] = temp;
            } else i++;
        }
    }
}
