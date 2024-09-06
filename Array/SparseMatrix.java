package Array;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Your matrix : ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 0) {
                    counter++ ;
                }
            }
        }
        if(counter > (5 * 5)/2) System.out.println("The matrix is sparse");
        else System.out.println("The matrix is not sparse");
    }
}
