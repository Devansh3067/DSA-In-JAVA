package Recursion.SSS;

import java.util.ArrayList;

public class MazeWithObstacles {

    public static int countPaths(int row, int col, int[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return 1;
        }
        if (maze[row][col] == 1) return 0;
        int answers = 0;
        if (row < maze.length - 1) {
            answers += (countPaths(row + 1, col, maze));
        }
        if (col < maze[0].length - 1) {
            answers += (countPaths(row, col + 1, maze));
        }
        if (row < maze.length - 1 && col < maze[0].length - 1) {
            answers += (countPaths(row + 1, col + 1, maze));
        }
        return answers;
    }

    public static ArrayList<String> printPaths(String str, int row, int col, int[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> answers = new ArrayList<>();
        if (maze[row][col] == 1) return answers;
        if (row < maze.length - 1) {
            answers.addAll(printPaths(str + "V", row + 1, col, maze));
        }
        if (col < maze[0].length - 1) {
            answers.addAll(printPaths(str + "H", row, col + 1, maze));
        }
        if (row < maze.length - 1 && col < maze[0].length - 1) {
            answers.addAll(printPaths(str + "D", row + 1, col + 1, maze));
        }
        return answers;
    }

    public static void main(String[] args) {
        int[][] maze = {{0, 1, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 0}};//1 denotes the obstacle
        System.out.println("V = Down, H = Right, D = Diagonal");

        //If we can go only down and right :-
        System.out.println(countPaths(0, 0, maze));
        System.out.println(printPaths("", 0, 0, maze));
    }
}
