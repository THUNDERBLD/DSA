// Find all the missing elements from the array in range 1 to N
// arr = [4,3,5,1,7,9] -> 2,6,8 are missing

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class question2{
    
    // the uniqueness of this question is that u wont be getting a completed sorted array after applying the binary search on it...
    // therfore u just have to use partially sorted array and apply the for loop in it then if the value of the i is not equal to (arr[value] - 1) then the element that suppose to be present in that index is the missing element in array...
    static int[] Sort(int[] arr){
        // creating the partially sorted array (the array is partially sorted because few of the element present in array are repeating themselves and few elements are missing from the range of 1 to N)
        int i = 0;
        while(i < arr.length){
            int realIndex = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != arr[realIndex]) {
                int temp = arr[i];
                arr[i] = arr[realIndex];
                arr[realIndex] = temp;  
            } else {
                i++;
            }
        }
        // checking the index because if there is a number exist that is not at its correct index, that means its actual index number is the missing number here...
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int some = j + 1;
            if(arr[j] != some){
                ans.add(some);
            }
        } 
        System.out.println("The missing elements : "+ans);
        System.out.print("From the array partially sorted array : ");
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,5,1,3,5,8,1,10,8};       
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}