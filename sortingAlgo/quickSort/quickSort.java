
import java.util.*;

public class quickSort{
    
    static int partation(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot; 
        arr[high] = temp;
        return i;
    }

    static void quick(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partation(arr, low, high);

            quick(arr, low, pivotIndex-1);
            quick(arr, pivotIndex+1, high);
        }
    }   
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,1,2};
        int low = 0;
        int high = arr.length-1;
        quick(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}