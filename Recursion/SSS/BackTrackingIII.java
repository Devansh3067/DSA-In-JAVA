package Recursion.SSS;
public class BackTrackingIII {

    public static void printArray(String[][] arrays) {
        for (String[] array : arrays) {
            for (String elem : array) {
                System.out.print(elem);
            }
            System.out.println();
        }
    }

    public static void printPaths(String p, String[][] path, int row, int col, int[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[0][0] = "🧍‍♂️";
            printArray(path);
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[row][col] == 1) {
            return;
        }

        // Mark as visited
        maze[row][col] = 1;

        // Set direction in path
        if (!(row == 0 && col == 0)) { // Avoid overwriting the starting point
            path[row][col] = "🛣️";
        }

        // For going down :
        if (row < maze.length - 1) {
            path[row][col] = "⬇️";
            printPaths(p + "D", path, row + 1, col, maze);
        }

        // For going right :
        if (col < maze[0].length - 1) {
            path[row][col] = "➡️";
            printPaths(p + "R", path, row, col + 1, maze);
        }

        // For going up :
        if (row > 0) {
            path[row][col] = "⬆️";
            printPaths(p + "U", path, row - 1, col, maze);
        }

        // For going left :
        if (col > 0) {
            path[row][col] = "⬅️";
            printPaths(p + "L", path, row, col - 1, maze);
        }

        // Undo the changes (backtrack)
        maze[row][col] = 0;
        path[row][col] = "🛣️"; // Reset path
        path[0][0] = "🧍‍♂️"; // Ensure the person symbol stays at the start
    }

    public static void main(String[] args) {
        int[][] maze1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};//1 denotes the obstacle
        String[][] path1 = {
                {"🧍‍♂️", "🛣️", "🛣️"},
                {"🛣️", "🛣️", "🛣️"},
                {"🛣️", "🛣️", "🛣️"},
                {"🛣️", "🛣️", "🏠"}
        };
        printPaths("", path1, 0, 0, maze1);


        System.out.println("-----------------------------------------------------------");
        int[][] maze2 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}, {0, 0, 0}}; // 1 denotes the obstacle
        String[][] path2 = {
                {"🧍‍♂️", "🛣️", "🛣️"},
                {"🛣️", "🌋", "🛣️"},
                {"🛣️", "🛣️", "🛣️"},
                {"🛣️", "🛣️", "🏠"}
        };
        printPaths("", path2, 0, 0, maze2);
    }
}
