// Set mismatch, get the element which is duplicating itself and the element which is removed by the duplicated element.
// eg => arr = [1,2,2,4] then ans = [2,3]

import java.util.*;

public class question5 {

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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int some = j+1;
            if(arr[j] != some){
                ans.add(arr[j]);
                ans.add(some);
            }
        } System.out.println("The duplicate element and the removed element : "+ans);
        System.out.print("From the array : ");
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,5};
        int[] ans = Sort(arr);       
        System.out.println(Arrays.toString(ans));
    }
}
