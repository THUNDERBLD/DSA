
import java.util.Arrays;

public class BSin2DArray {

    static int[] Search(int[][] arr, int target){
        int rows = 0;
        int cols = arr.length;
            while(rows < arr.length && cols >= 0){
                if(arr[rows][cols] == target){
                    return new int[]{rows,cols};
                } 
                if(arr[rows][cols] < target){
                    rows++;
                } else {
                    cols--;
                }
            }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 10;
        for (int[] elem : arr) {
            System.out.println(Arrays.toString(elem));
        }
        int[] ans = Search(arr, target);
        System.out.println("The index of the targeted element : "+Arrays.toString(ans));
    }
}
