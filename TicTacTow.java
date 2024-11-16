import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacTow {
    public static void print(char[][] canvas) {
        for (char[] row : canvas) {
            for (char col : row) {
                System.out.print(col + " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char[][] canvas,char player) {
        player = (player == 'X') ? 'O' : 'X'; // I want to change the player, because in the main func the player changes without checking, Thus to reverse that change I made this change.
        for (char[] row : canvas) {
            if (row[0] == player && row[1] == player && row[2] == player) {
                return true;
            }
        }
        for (int col = 0; col < canvas[0].length; col++) {
            if (canvas[0][col] == player && canvas[2][col] == player && canvas[1][col] == player) {
                return true;
            }
        }
        if(canvas[0][0] == player && canvas[1][1] == player && canvas[2][2] == player){
            return true;
        }
        return canvas[2][0] == player && canvas[0][2] == player && canvas[1][1] == player;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] canvas = new char[3][3];
        for(char[] ch : canvas){
            Arrays.fill(ch,' ');
        }
        print(canvas);
        int count = 0;
        char player = 'X';
        while (!haveWon(canvas,player) && count < 9) {
            System.out.println("Player " + player + " turn :");
            System.out.println("Enter row and col");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(canvas[row][col]!=' '){
                System.out.println("Invalid move");
                continue;
            }
            canvas[row][col] = player;
            count++;
            print(canvas);
            player = (player == 'X') ? 'O' : 'X';
        }
        if(count == 9){
            System.out.println("Chichdi pak gyi");
        } else{
            player = (player == 'X') ? 'O' : 'X';
            System.out.println("Player "+player+" Won!!! \uD83E\uDD73");
        }
    }
}
