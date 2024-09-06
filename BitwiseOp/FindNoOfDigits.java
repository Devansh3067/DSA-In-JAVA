package BitwiseOp;

public class FindNoOfDigits {
    public static void main(String[] args) {
        int num = 3640;
        int base = 10;

        int digits = (int)(Math.log(num)/Math.log(base)) + 1;
        System.out.println("Number of digits : " + digits);
    }
}
