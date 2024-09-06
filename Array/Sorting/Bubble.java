package Array.Sorting;

import java.util.Arrays;

/*In this sorting algo we keep on comparing an every element with the previous one and then we sort them
After every iteration one element (least) comes at its correct position...*/
public class Bubble {
    void bubbleSort(int[] array){
        int temp ;
        boolean  swapped = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                swapped = false;
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        Bubble obj = new Bubble();
        int[] array = {3,1,5,4,2};
        obj.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
