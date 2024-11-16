package LeetCode75;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1))){
            return "";
        }
        int a = Math.max(str1.length(),str2.length());
        int b = Math.min(str1.length(),str2.length());
        while(b > 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return str1.substring(0,a);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
    }
}
