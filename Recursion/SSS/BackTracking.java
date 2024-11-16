package Recursion.SSS;

import java.util.ArrayList;

public class BackTracking {
    public static ArrayList<String> printPaths(String str, int row, int col, int[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> answers = new ArrayList<>();
        if (maze[row][col] == 1) return answers;
        // For going down :
        if (row < maze.length - 1) {
            maze[row][col] = 1;
            answers.addAll(printPaths(str + "D", row+1, col , maze));
        }

        // For going right :
        if (col < maze[0].length - 1) {
            maze[row][col] = 1;
            answers.addAll(printPaths(str + "R", row, col+1, maze));
        }

        // For going up :
        if (row > 0) {
            maze[row][col] = 1;
            answers.addAll(printPaths(str + "U", row - 1, col, maze));
        }

        // For going left :
        if (col > 0) {
            maze[row][col] = 1;
            answers.addAll(printPaths(str + "L", row, col - 1, maze));
        }
        maze[row][col] = 0;
        return answers;
    }

    public static void main(String[] args) {
        int[][] maze = {{0, 1, 0}, {0, 0, 0}, {0, 0, 0}};//1 denotes the obstacle
        System.out.println(printPaths("", 0, 0, maze));
    }
}
