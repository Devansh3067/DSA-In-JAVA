package LeetCode75;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int idx = -1;
        for(int i = 0 ; i < s.length() ; i++){
            idx = t.indexOf(s.charAt(i), idx+1);
            if(idx == -1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
}
