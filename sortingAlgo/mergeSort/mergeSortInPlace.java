// Not very important, try to do it from the first method
// in place means we are going to use the merge sort without making any copy of arrays  

import java.util.*;

class mergeSortInPlace{
    
    static void mergeInPlace(int[] arr, int start, int end){
        if(end - start == 1) return;
        int mid = (start + end)/2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end); 

        sortInPlace(arr, start, mid, end);
    }

    static void sortInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];
        int i = start, j = mid, index = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[index] = arr[i];
                i++;
            } else {
                mix[index] = arr[j];
                j++;
            }
            index++;
        }
        
        while(i < mid){
            mix[index] = arr[i];
            i++;
            index++;
        }
        
        while(j < end){
            mix[index] = arr[j];
            j++;
            index++;
        }

        for(int l = 0; l < mix.length; l++){
            arr[start+l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,7,9,6};
        mergeInPlace(arr, 0, arr.length);    
        System.out.println(Arrays.toString(arr));
    }
}