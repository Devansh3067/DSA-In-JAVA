package BitwiseOp;

import java.util.Arrays;

public class FlipAnImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            for(int col = 0 ; col < (image[0].length + 1) / 2; col++){
                int temp = row[col]^1;
                row[col] = row[image[0].length - col - 1]^1;
                row[image[0].length - col - 1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println("The inverted image = " + Arrays.deepToString(ans));
    }
}
