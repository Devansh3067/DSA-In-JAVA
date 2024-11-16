package LeetCode;

//Google Question...
public class HappyNumber {
    private int sumOfSqOfDigits(int n) {
        int sum = 0;
        int r;
        while (n != 0) {
            r = n % 10;
            sum = sum + r * r;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        while (fast != 1 && sumOfSqOfDigits(fast) != 1) {
            fast = sumOfSqOfDigits(sumOfSqOfDigits(fast));
            slow = sumOfSqOfDigits(slow);
            if (slow == fast) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        if (obj.isHappy(10)) {
            System.out.println("The number is Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}
