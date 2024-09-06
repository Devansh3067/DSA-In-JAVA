package Array;

import java.util.Scanner;

public class SwapTwoElementsInArray {

    void swap(int index1, int index2, int[] arr) {
        arr[index2] = arr[index1] + arr[index2];
        arr[index1] = arr[index2] - arr[index1];
        arr[index2] = arr[index2] - arr[index1];
    }

    public static void main(String[] args) {

        SwapTwoElementsInArray ArrayObj = new SwapTwoElementsInArray();

        Scanner sc = new Scanner(System.in);

        //Creating an array
        int[] arr = new int[5];

        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the two index to swap their values");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        //First we will show the original array
        System.out.println("The Entered Array : ");
        for (int elem : arr) {
            System.out.printf(elem + "\t");
        }

        ArrayObj.swap(index1, index2, arr);

        System.out.println("\nThe Swapped Array:");
        for (int elem : arr) {
            System.out.print(elem + "\t");
        }
    }
}