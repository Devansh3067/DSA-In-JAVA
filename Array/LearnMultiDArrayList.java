package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LearnMultiDArrayList{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation...
        for(int i = 0;i<3;i++){
            list.add(new ArrayList<>()); // Three array lists are added now
        }

        System.out.println("Enter elements in Array List :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(j).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}