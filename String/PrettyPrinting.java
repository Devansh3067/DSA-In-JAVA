package String;

public class PrettyPrinting {
    public static void main(String[] args) {
        //formatted string...
        float f = 45.342645f;
        System.out.printf("Formatted float is : %.3f ", f); //This prints the float f till 3 decimal values after rounding off.
        System.out.println();
        System.out.printf("Value of pie = %.3f ", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I live in %s","Devansh","Kanpur");

    }
}
