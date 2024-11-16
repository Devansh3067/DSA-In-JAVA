package LinkedList.DoublyLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();

        list.customInsert(30,199);
        list.insertLast(30);
        list.customInsert(30,199);
        list.insertLast(40);
        list.insertLast(50);
        list.insertBeg(1);
        list.show();
        list.customInsert(40,99);
        list.show();
        list.showRev();

        char option;
        int val;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Enter 1 to insert a node at beginning");
            System.out.println("Enter 2 to insert a node at end");
            System.out.println("Enter 3 to delete a node from beginning");
            System.out.println("Enter 4 to delete a node from end");
            System.out.println("Enter 5 to display");
            System.out.println("Enter 6 to search a node");
            System.out.println("Enter 7 to count the number of nodes");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the value of new node:");
                    val = sc.nextInt();
                    list.insertBeg(val);
                    break;
                case 2:
                    System.out.println("Enter the value of new node:");
                    val = sc.nextInt();
                    list.insertLast(val);
                    break;
                case 3:
                    System.out.println("The node is deleted from beginning");
                    list.deleteBeg();
                    break;
                case 4:
                    System.out.println("The node is deleted from last");
                    list.deleteLast();
                    break;
                case 5:
                    System.out.println("The list -->");
                    list.show();
                    break;
                case 6:
                    System.out.println("Enter the value to be searched");
                    val = sc.nextInt();
                    list.search(val);
                    break;
                case 7:
                    System.out.println("Number of node = " + list.size);
                    val = sc.nextInt();
                    list.search(val);
                    break;
                default:
                    System.out.println("Invalid choice. Try Again !!!");
            }
            System.out.println("Do you want to continue with operations.\nEnter Y for yes or N for no");
            option = sc.next().charAt(0);
        } while (option == 'Y' || option == 'y');
        System.out.println("----------End-----------");
    }
}
