package BitwiseOp;

import java.util.Scanner;

public class PowerOfTwo {
    public static void methodOne(int num){
        int counter = 0;
        while(num > 0){
            if((num&1) == 1) counter++;
            num = num >> 1;
        }
        if(counter == 1) System.out.println("The number is a power of two from method One");
        else System.out.println("The number is not a power of two from method One");
    }
    public static void methodTwo(int num){
        if(num==0) {
            System.out.println("The number is not a power of 2");
            return;
        }
        if((num & num-1) == 0) System.out.println("The number is a power of two from method Two");
        else System.out.println("The number is not a power of two from method Two");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num = sc.nextInt();
        methodOne(num);
        methodTwo(num);
    }
}
