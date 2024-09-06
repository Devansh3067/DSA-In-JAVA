package BitwiseOp;

public class NthMagicNo {
    public static int magicNo(int n) {
        int i = 0;
        int ans = 0;
        while (n > 0) {
            ans += (int) ((n & 1) * Math.pow(5, ++i));
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("The nth Magic No = " + magicNo(n));
        System.out.println("The nth Magic No = " + magicNo(1));
        System.out.println("The nth Magic No = " + magicNo(2));
    }
}
