package BitwiseOp;

public class MinimumBitFlipsToConvertNumber {
    public static int minBitFlips(int start, int goal) {
        int steps  = 0;
        int len1 = (int)(Math.log10(start)/Math.log10(2)) + 1;
        int len2 = (int)(Math.log10(goal)/Math.log10(2)) + 1;
        int len = (int)Math.max(len1,len2);
        for(int i = 0 ; i < len ; i++){
            int a = 1<<i;
            if((start & a) != (goal & a)){
                start = start ^ a;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }
}
