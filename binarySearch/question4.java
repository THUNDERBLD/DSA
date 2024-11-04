// find first and last position of more than one element of same value in the sorted array

import java.util.Arrays;

public class question4 {
    static int Search(int[] arr, int target, boolean findStartIndex){
        int ans = -1; // this one is going to be a potential answer until real answer is found
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; start <= end; i++) {
            int mid = start + ((end - start)/2);
            if(target < arr[mid]){
                end = mid-1;
            } else if(target > arr[mid]){
                start = start + 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    static int[] position(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = Search(arr, target, true);
        int end = Search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5,5,6,6,6,8};
        int target = 5;
        int[] ans = position(arr, target);
        System.out.println("the element starting and ending at index : "+Arrays.toString(ans));
    }
}
