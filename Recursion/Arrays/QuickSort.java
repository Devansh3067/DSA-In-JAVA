package Recursion.Arrays;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] num, int first, int second) {
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }

    public static int partition1(int[] num, int low, int high) {
        int pivot = num[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (num[i] <= pivot) {
                i++;
            }
            while (num[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(num, i, j);
            }
        }
        swap(num, low, j);
        return j;
    }

    public static void quickSort1(int[] num, int low, int high) {
        if (low < high) {
            int j = partition1(num, low, high);
            quickSort1(num, low, j);
            quickSort1(num, j + 1, high);
        }
        return;
    }

    public static int partition2(int[] num, int low, int high) {
        int mid = (low + high) / 2;
        int pivot = num[mid];
        int i = low;
        int j = high;
        while (i < j) {
            while (num[i] <= pivot) {
                i++;
            }
            while (num[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(num, i, j);
            }
        }
        swap(num, low, j);
        return j;
    }

    public static void quickSort2(int[] num, int low, int high) {
        if (low < high) {
            int j = partition2(num, low, high); // this is a better way to do it. As it takes the pivot as the middle element.
            quickSort2(num, low, j);
            quickSort2(num, j + 1, high);
        }
        return;
    }

    public static void main(String[] args) {
        int[] array1 = {879, 201, 302, 552, 318, 530, 898};
        quickSort1(array1, 0, array1.length - 1);
        System.out.println(Arrays.toString(array1));


        System.out.println("-----------------------------------------------------------");


        int[] array2 = {10, 80, 30, 90, 40, 50, 70};
        quickSort1(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------------------------------");


        int[] array3 = {10, 20, 30, 40, 50, 60, 70};
        quickSort2(array3, 0, array3.length - 1);
        System.out.println(Arrays.toString(array3));
    }
}
