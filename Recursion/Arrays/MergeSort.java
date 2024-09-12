package Recursion.Arrays;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] first, int[] second){
        int i = 0, j = 0 , k = 0;
        int[] merged = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                merged[k++] = first[i];
                i++;
            }
            else{
                merged[k++] = second[j];
                j++;
            }
        }
        while(i< first.length){
            merged[k++] = first[i++];
        }
        while(j<second.length){
            merged[k++] = second[j++];
        }
        return merged;
    }
    public static int[] mergeSort(int[] num) {
        if (num.length == 1) {
            return num;
        }
        int mid = num.length / 2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(num, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(num, mid, num.length));
        return merge(leftArr,rightArr);
    }

    public static void main(String[] args) {
        int[] num = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(num)));
    }
}
