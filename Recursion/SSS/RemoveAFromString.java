package Recursion.SSS;

public class RemoveAFromString {

    private static void removeA(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        if (str.charAt(0) != 'a') {
            removeA(str.substring(1), ans + str.charAt(0));
        } else {
            removeA(str.substring(1), ans);
        }
    }

    public static String removeA(String str) {
        if(str.isEmpty()) return str;
        if(str.charAt(0) != 'a') return str.charAt(0) + removeA(str.substring(1));
        return removeA(str.substring(1));
    }

    public static String removeApple(String str) {
        if(str.isEmpty()) return str;
        if(str.startsWith("apple")) return  removeApple(str.substring(5));
        return str.charAt(0) + removeApple(str.substring(1));
    }

    public static void main(String[] args) {
        removeA("abracadabra", ""); //This is way 1
        System.out.println(removeA("alabaman")); //This is way 2

        //What if we want to skip full word...
        System.out.println(removeApple("adams apple is good"));
    }
}
