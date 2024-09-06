package Array.BinarySearch;

public class FindSQRT {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start)/2;
            long square = (long) mid * mid; // Cast to long to prevent overflow
            if (square > x) end = mid - 1;
            else if (square < x) start = mid + 1;
            else return mid;
        }
        return end;
    }
    public static void main(String[] args) {
        FindSQRT obj = new FindSQRT();
        int sqrt = obj.mySqrt(2147395599);
        System.out.println((int) Math.sqrt(2147395599));
        System.out.println("Square root rounded down to the nearest integer : " + sqrt);
    }
}
