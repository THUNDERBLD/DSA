// steps to solve
// 1. divide the array into 2 parts 
// 2. sort both the parts of the array 
// 3. merge them into new array
// 4. make a new function which will have 2 pointers, which is going to traverse on both arrays 
// 5. now just compare both the pointers and add them in new array 

// IMP
// Remember in recursion after completion of all the call backs, the backtracking occurred and after backtracking the next line code will execute..
// Backtracking pura hona ka bad, us he function ki agli line execute hogi jis line ka user function calling itself ho raha hoga
// Time complexity of the algo is O(n*log(n)) and space complexity is O(n).

import java.util.*;

public class mergeSort{

    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        // firstly u will get a array of single number in left array then backtracking happened after that right will exicute
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));  
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length)); // this step will run after backtracking left is complete
    
        return Sorting(left, right);  // this code will run after backtracking right is complete

    }

    static int[] Sorting(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; 

        int i = 0;  // i will traverse over first 
        int j = 0;  // j will traverse over second
        int k = 0;  // k will traverse over new merged array

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // if second array is smaller than first array then this condition will run
        // basically add the remaining element into the array
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        // if first array is smaller than second array then this condition will run
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix; 
    }

    public static void main(String[] args){
        int[] arr = {5,6,3,2,1};
        System.out.println("The sorted array : "+Arrays.toString(merge(arr)));
    }
}