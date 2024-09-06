package Array;

import java.util.*;

public class LearnArray {

    void changeValue(int idx,int num,int[] arr){
        arr[idx] = num;
        for(int elem : arr){
            System.out.print(elem + "\t");
        }
    }
    public static void main(String[] args) {

        LearnArray array = new LearnArray();

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array :");

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));//New Method tpo print the elements of an array.

        System.out.println("The array elements are :");

        /// New Way to write for loop ... forEach loop


        for (int number : arr) {
            System.out.print(number + "\t");
        }

        System.out.println();

        System.out.println("Enter the index at which the value is to be changed");
        int index = sc.nextInt();
        System.out.println("Enter the value");
        int value = sc.nextInt();
        array.changeValue(index,value,arr);

        System.out.println();

        //Creating 2D array...

        System.out.println("Enter the elements of 2D Array...");
        int[][] twoDArr = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j = 0 ; j<3 ; j++){
                twoDArr[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<3;i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(twoDArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}