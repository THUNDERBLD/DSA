import java.util.*;

public class anotherMethod {
    
    static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        // lets set the pivot to its correct position using this loop
        while(start <= end){
            // also a reason why, if its already sorted it will not swap
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // now the pivot is at correct index, now we sort the 2 halfs of the array
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,7,6,8};
        quickSort(arr, 0, arr.length-1);
        System.err.println("arr: " + Arrays.toString(arr));
    }
}
