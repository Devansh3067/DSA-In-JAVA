package BitwiseOp;

public class UniqueNumber {
    public static void main(String[] args) {
        int unique = 0;
        int[] num = {2, 4, 4, 5, 5, 3, 2};
        for (int elem : num) unique ^= elem;
        System.out.println("Unique Element : " + unique);
    }
}
