// find all the duplicate elements in the array within range (1 to N) with time complexity of O(n)
// eg => arr = [1,2,2,4,5,3,3,8] then answer => [2,3]

import java.util.*;

public class question4 {

    static int[] Sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int realIndex = arr[i] - 1;
            if(arr[i] != arr[realIndex]){
                int temp = arr[i];
                arr[i] = arr[realIndex];
                arr[realIndex] = temp;
            } else {
                i++;  
            }
        }
        
        List<Integer> arrs = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int some = j+1;
            if(arr[j] != some){
                arrs.add(arr[j]);
            }
        }
        System.out.println("The dublicate element : "+arrs);
        System.out.print("From the array : ");
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,3,3,8};
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
