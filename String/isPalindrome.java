package String;

public class isPalindrome {

    boolean is_Palindrome(String str) {
        str = str.toLowerCase();
        //using two pointer approach
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if(str.charAt(start) == ' ') start ++;
            if(str.charAt(end) == ' ') end--;
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw";
        isPalindrome obj = new isPalindrome();
        boolean check = obj.is_Palindrome(str);
        System.out.println(check);
    }
}
