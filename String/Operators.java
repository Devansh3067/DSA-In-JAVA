package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String args[]) {
        System.out.println('a' + 'b');//This adds the ASCII values of a and b.
        System.out.println("a" + "b");
        System.out.println("A" + 1);// 1 gets converted to string and both strings will be concatenated.
        System.out.println((char) ('a' + 3));//here a + 3 results to 100 and then (char) result in converting it to char again ie 'd'.
        System.out.println("a"+new ArrayList<>());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        System.out.println("a"+list);
        //For + operator to work in an expression the expression should contain all the primitive type variables or at least a string.This is the example of operator overloading. Java generally does not allow overloading of operators ... but this is an exception ...
        //For example:
        System.out.println(new Integer(56) + "" +new ArrayList<>());//This works perfectly because we have added an empty string in the expession.

    }
}
