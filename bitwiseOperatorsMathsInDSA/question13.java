
import java.util.Arrays;

// Flipping the image of 2D array
// first find the image of the array -> [1,0,0] -> [0,0,1]
// then find invert the image -> [0,0,1] -> [1,1,0]

public class question13 {

    static void image(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = temp;
            }
        }
        // just for printing
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
    }

    static void complement(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[i][j] ^ 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        image(arr);
        complement(arr);

    }
}
