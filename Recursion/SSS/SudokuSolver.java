package Recursion.SSS;

public class SudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int i) {
        //Checking horizontally:
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == i + '0') {
                return false;
            }
        }
        //Checking vertically:
        for (char[] chars : board) {
            if (chars[col] == i + '0') {
                return false;
            }
        }
        //Checking in box:
        int boxR = row / 3 * 3; // This gives the starting coordinate of it 3x3 box.
        int boxC = col / 3 * 3; // This gives the starting coordinate of it 3x3 box.
        for (int j = boxR; j <= boxR + 2; j++) {
            for (int k = boxC; k <= boxC + 2; k++) {
                if (board[j][k] == i + '0') return false;
            }
        }
        return true;
    }

    public static boolean sudokuSolver(char[][] board, int row, int col) {
        if (row == board.length) {
            //System.out.println(Arrays.deepToString(board));
            return true;
        }
        if (col == board.length) {
            return sudokuSolver(board, row + 1, 0);
        }
        if (!(board[row][col] == '.')) {
            return sudokuSolver(board, row, col + 1);
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (sudokuSolver(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        printBoard(board);
        System.out.println();
        sudokuSolver(board, 0, 0);
        printBoard(board);
    }
}
