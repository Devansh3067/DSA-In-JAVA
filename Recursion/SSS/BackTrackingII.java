package Recursion.SSS;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTrackingII {

    public static void printArray(int[][] arrays) {
        for (int[] array : arrays) {
            for (int elem : array) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    public static void printPaths(String p, int[][] path, int count, int row, int col, int[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = count;
            printArray(path);
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[row][col] == 1) return;
        path[row][col] = count;
        // For going down :
        if (row < maze.length - 1) {
            maze[row][col] = 1;
            printPaths(p + "D", path, count + 1, row + 1, col, maze);
        }

        // For going right :
        if (col < maze[0].length - 1) {
            maze[row][col] = 1;
            printPaths(p + "R", path, count + 1, row, col + 1, maze);
        }

        // For going up :
        if (row > 0) {
            maze[row][col] = 1;
            printPaths(p + "U", path, count + 1, row - 1, col, maze);
        }

        // For going left :
        if (col > 0) {
            maze[row][col] = 1;
            printPaths(p + "L", path, count + 1, row, col - 1, maze);
        }
        maze[row][col] = 0;
        path[row][col] = 0;
    }

    public static void main(String[] args) {
        int[][] maze = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}, {0, 0, 0}};//1 denotes the obstacle
        int[][] path = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        printPaths("", path, 1, 0, 0, maze);
    }
}
