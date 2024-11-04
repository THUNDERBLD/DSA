// Very Important because in this only one loop is running
// when given the number from range (1 to N) that means array of 1 to N but elements are jumbled then use the cyclic sort
// eg => N = 8 therefore -> [4,2,1,5,3,7,6,8]
// In this sort we take i from index 0 and as we know that in this sort the element are sequentially arranges from 1 to N just ordered is in jumble 
// now we have to create a new variable for storing the real Index of elements, as we can see ideally every element have index = its value -1 ie. val 3 have index 2 and value 7 have index 6 and value 10 have index 9 and so on..
// now just swap the number if arr[i] is not equal to its actual index element ie arr[realIndex] 

import java.util.Arrays;

public class cycleSort{

    static int[] Sort(int[] arr){
        // this is using for loop( it is working fine but it is not fully effecient to use it in for loop )
        // for (int i = 0; i < arr.length; i++) {
        //     int realIndex = arr[i] - 1;
        //     if(arr[i] != arr[realIndex]){
        //         int temp = arr[i];
        //         arr[i] = arr[realIndex];
        //         arr[realIndex] = temp;
        //     }
        // }

        // this is using while loop( see the value of i is only changing when element of first index is sorted )
        int i = 0;
        while(i < arr.length){
            int realIndex = arr[i] - 1;
            if(arr[i] != arr[realIndex]){
                int temp = arr[i];
                arr[i] = arr[realIndex];
                arr[realIndex] = temp;
            } else {
                i++;  
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1,9,6,7,8,10,13,11,12};       // as we can see that elements are from (1 to N) ie. (1 to 9)
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}