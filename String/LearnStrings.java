package String;

import java.util.Arrays;

public class LearnStrings {
    public static void main(String[] args) {
        String name = "Devansh Bajpai";
        String about = "String is the most commonly used class in Java";
        System.out.println(name);
        System.out.println(about);

        String a1 = "Devansh";
        String b1 = "Devansh";
        System.out.println(a1==b1);//This gives true because both a and b point towards same object in the heap memory.
        System.out.println(a1.equals(b1));//This gives true because values are same

        String a2 = new String("Devansh");
        String b2 = new String("Devansh");
        System.out.println(a2==b2); // This gives false because a2 and b2 point towards diff objects in heap.
        System.out.println(a2.equals(b2));//This gives true because values are same
        System.out.println(new int[]{1,2,3,4,5}); // This does not print the array because println uses the toString method which does not work for objects like arrays, hashmaps, etc.
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));//This toString function is the normal one it is from the Arrays class. An example of function overloading.

    }
}
