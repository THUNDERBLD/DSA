// Selection sort means select any element and put it in its actual position...
// ---> First approach
// let say u have selected the largest element and u place it in the end of the array, then place the second largest element in the second largest index, and soo on...
// ---> Second approach
// u can also pick the smallest element in the array and place it into first index, then second samllest element and place it into second smallest index, and soo on...
// worst case O(N^2)
// best case O(N^2)  -> only used in small array 

import java.util.Arrays;

public class selectionSort {

    static int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the last unsorted element
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 9, 3, 1, 8, 7, 6, -21};
        int[] ans = Sort(arr);
        System.out.println("The sorted array: " + Arrays.toString(ans));
    }
}
 