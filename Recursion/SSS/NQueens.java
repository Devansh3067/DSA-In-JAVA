package Recursion.SSS;

public class NQueens {

    public static void display(int[][] board) {
        for (int[] array : board) {
            for (int elem : array) {
                if (elem == 1) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("X\t");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        //Checking vertical row :
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }
        //Checking left diagonal :
        int left = Math.min(row, col);
        for (int i = 1; i <= left; i++) {
            if (board[row - i][col - i] == 1) return false;
        }
        //Checking right diagonal :
        int right = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= right; i++) {
            if (board[row - i][col + i] == 1) return false;
        }

        return true;
    }

    public static int findWays(int[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;// 1 mean that the Queen is placed.
                count += findWays(board, row + 1);
                board[row][col] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        System.out.println(findWays(board,0));


    }
}
