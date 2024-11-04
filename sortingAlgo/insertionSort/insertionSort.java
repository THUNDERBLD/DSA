// --> j is the itrator of the inside loop and i is the irator of the first loop
// In this sort we just have to take 0 and 1 index of the array then put the j = 1st index(remember value of j is always decreasing that means j is coming from the higher index) and sort the 0 and 1st index elements
// then j = 2nd index and sort between 0 to 2 index, and repeat it again and again till j goes to second last index (j = arr.length - 1)
// best case complexity -> O(N)
// worst case complexity -> O(N^2)
// this sort is used in medium size arrays and it is little faster then bubble and selection sort

import java.util.Arrays;


public class insertionSort{

    static int[] Sort(int[] arr){
        for(int i= 0; i < arr.length-1; i++ ){
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break; // if the element is already sorted then break from the inside loop // break can only make us comes out of the one loop at a time
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,9,5,1,8,6,7,-2};
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}