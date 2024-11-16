package Recursion.SSS;

import java.util.ArrayList;

public class FindPaths {
    public static int countPaths(int row, int col) {
        if (row < 1 || col < 1) {
            return 0;
        }
        if (row == 1 || col == 1) {
            return 1;
        }
        return countPaths(row - 1, col) + countPaths(row, col - 1);
    }

    public static ArrayList<String> printPaths(String str, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> answers = new ArrayList<>();
        if (row > 1) {
            answers.addAll(printPaths(str + "V", row - 1, col));
        }
        if (col > 1) {
            answers.addAll(printPaths(str + "H", row, col - 1));
        }
        return answers;
    }

    public static void main(String[] args) {
        int row = 3, col = 3;
        System.out.println("V = Down, H = Right, D = Diagonal");

        //If we can go only down and right :-
        //System.out.println(countPaths(row, col));
        System.out.println(printPaths("", row, col));

        //If we can go down right and diagonally :-
        System.out.println(printPathsDiagonal("", row, col));
    }

    private static ArrayList<String> printPathsDiagonal(String str, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> answers = new ArrayList<>();
        if (row > 1) {
            answers.addAll(printPathsDiagonal(str + "V", row - 1, col));
        }
        if (col > 1) {
            answers.addAll(printPathsDiagonal(str + "H", row, col - 1));
        }
        if (row > 1 && col > 1) {
            answers.addAll(printPathsDiagonal(str +"D",row-1,col-1));
        }
        return answers;
    }
}
