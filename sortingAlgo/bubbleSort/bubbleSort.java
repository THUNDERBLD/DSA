// BubbleSort/SinkingSort/ExchangeSort
// In this the largeset element comes to the last index of array for every iteration of loop then another iteration second largest element comes to the second largest index, and soo onn...
// create i and j counter which j will start from index 1(not from index 0) and i is from the index 0...
// then j will end at arr.length-1 but every time the loops ends then just u have to increase the value of the i
// therefore the condition in the loop is arr.length-1-i; 
// worst case time complexity -> O(N^2) -> Reverse sorted array
// best case time complexity -> O(N) -> already Sorted array -> its actually N-1 but constants are ignored in time complexity 

import java.util.*;

class bubbleSort{

    static int[] Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;   // just an edge case
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {   // just by changing the < sign to > u can convert the array in reverse sort
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {     // just an edge case
                break;
            }
        } 
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,10,1,2,3,4,5,6,11,15,12};
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}