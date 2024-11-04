// Rotation of the array in right hand side
import java.util.Arrays;

public class question5 {
    static int[] rotate(int[] arr, int rotations){
        int k = 0;
        int[] temp = new int[arr.length]; 
        for (int i = rotations; i < arr.length; i++) {
            temp[k] = arr[i];
            k++;
        } 
        for(int i = 0; i < rotations; i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int rotations = 3;
        int[] ans = rotate(arr, rotations);
        System.out.println(Arrays.toString(ans));
    }
}
