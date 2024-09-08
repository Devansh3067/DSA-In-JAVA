package Patterns;

public class Cross {
    public static void main(String[] args) {
        String input = "welcome";
        System.out.println(input.length());
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i == j) {
                    System.out.print(input.charAt(i) + "  ");
                }
                else if (i + j == input.length() - 1) {
                    System.out.print(input.charAt(j) + "  ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
