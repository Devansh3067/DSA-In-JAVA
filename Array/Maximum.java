package Array;

public class Maximum {

    int findMaxElem(int[] arr){
        int max = arr[0];
        for (int elem : arr){
            if(max<elem){
                max = elem;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Maximum obj = new Maximum();

        int[] arr = {1, 2, 3, 4, 2, 4, 219, 43, 62};

        System.out.println(obj.findMaxElem(arr));
    }
}