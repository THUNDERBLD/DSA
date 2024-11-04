// Reverse( swap the first element with the last element ) the element in array 

import java.util.*;

public class question4 {
    
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int limit = arr.length/2;
        for (int i = 0; i < limit; i++) {
            if(arr[start] < arr[end]){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                // changes the values
                start = start + 1; ;
                end = end - 1;
            } 
            if(arr[start] == arr[end]){
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,5,6,7,8,9}; // odd no. of elements
        int[] arr2 = {1,2,3,4,5,6}; // even no. of elements
        System.out.print("array without reverse function : "+Arrays.toString(arr));
        System.out.println();
        reverse(arr);
        System.out.print("array with reverse function : "+Arrays.toString(arr));
    }
}
