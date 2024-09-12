package LeetCode;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String word : words){
            boolean consistent = true;
            for(int i = 0; i < word.length(); i++){
                if(allowed.indexOf(word.charAt(i)) == -1){
                    consistent = false;
                    break;
                }
            }
            if(consistent) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad",words));
    }
}
