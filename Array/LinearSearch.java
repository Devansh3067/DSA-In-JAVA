package Array;

import java.util.Scanner;

public class LinearSearch {

    boolean isPresent(int[] arr, int target) {

        if (0 == arr.length) return false;

        for (int elem : arr) {
            if (elem == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        LinearSearch obj = new LinearSearch();

        Scanner sc = new Scanner(System.in);

        System.out.println("Set the length of the array..:");
        int length = sc.nextInt();

        int[] arr = new int[length];

        //Get elements from users
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the number to be searched:");
        int number = sc.nextInt();

        //Searching for the number...
        if (obj.isPresent(arr, number)) {
            System.out.println("The number is present 🙂‍↕️.");
        } else System.out.println("The number is not present 🙅.");
    }
}
