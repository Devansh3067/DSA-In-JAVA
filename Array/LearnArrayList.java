package Array;

import java.util.ArrayList;
import java.util.Scanner;

//Array lists are dynamic arrays...

public class LearnArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(20);
        list.add(3);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(10);
        list.add(200);

        list.add(2,99); // adds 99 to the index no 2...
        list.set( 3 , 399);// sets the index no 3 elem to 399...
        boolean x =list.contains(9); //true..
        System.out.println(list + " " + x);

       //take input by user...

        ArrayList <Integer> newList = new ArrayList<>(5);

        //Suppose we want to take 5 values as input...

        System.out.println("Enter 5 elements : ");
        for(int i=0;i<5;i++){
            newList.add(sc.nextInt());
        }
        System.out.println();

        System.out.println("The Elements are :");
        System.out.println(newList);

        //If we want to get an element from list...
        System.out.println(newList.get(2));
    }
}