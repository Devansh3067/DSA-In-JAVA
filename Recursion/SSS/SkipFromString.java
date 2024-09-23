package Recursion.SSS;

public class SkipFromString {

    private static void skipA(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        if (str.charAt(0) != 'a') {
            skipA(str.substring(1), ans + str.charAt(0));
        } else {
            skipA(str.substring(1), ans);
        }
    }

    public static String skipA(String str) {
        if(str.isEmpty()) return str;
        if(str.charAt(0) != 'a') return str.charAt(0) + skipA(str.substring(1));
        return skipA(str.substring(1));
    }

    public static String skipApp(String str){
        if(str.isEmpty()) return str;
        if(str.startsWith("app") && !str.startsWith("apple")) return skipApp(str.substring(3));
        return str.charAt(0) + skipApp(str.substring(1));
    }

    public static String skipApple(String str) {
        if(str.isEmpty()) return str;
        if(str.startsWith("apple")) return  skipApple(str.substring(5));
        return str.charAt(0) + skipApple(str.substring(1));
    }

    public static void main(String[] args) {
        skipA("abracadabra", ""); //This is way 1
        System.out.println(skipA("alabaman")); //This is way 2

        //What if we want to skip full word...
        System.out.println(skipApple("adams apple is good"));

        //Remove app only if it is not apple...
        System.out.println(skipApp("adam eats apple while using mobile app"));
    }
}
