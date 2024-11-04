import java.util.*;

public class recursionBubbleSort {

    static void Sort(int[] arr, int i, int j){
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(j < arr.length){
            if(arr[i] < arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            Sort(arr, i, j+1);
        } else {
            Sort(arr, i+1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3,2,9,1};
        int i = 0;
        int j = 0;
        Sort(arr, i, j); 
    }
}
