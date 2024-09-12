package Recursion;

/*      ****
 *       ***
 *       **
 *       *      */
public class Triangle {
    public static void pattern(int row, int col) {
        if(row==0) return;
        if(col<row){
            System.out.print("*");
            pattern(row,col+1);
        }
        else {
            System.out.println();
            pattern(row-1,0);
        }
    }

    public static void main(String[] args) {
        pattern(4,0);
//        for(int i = 5 ; i >= 1; i--){
//            for(int j = 1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
