// this file only have array related recursion problems
import java.util.ArrayList;

public class recursionOnArray {

    // find weather an array is sorted or not
    static void sorted(int[] arr, int i){
        if(i == arr.length-1){
            System.out.println("array is sorted");
            return;
        }
        if(arr[i] <= arr[i+1]){
            sorted(arr, i+1);
        } else {
            System.out.println("array is not sorted");
        }
    }

    static int linearSearch(int[] arr, int target, int i){
        if(arr[i] == target){     
            return i;
        } 
        if(i >= arr.length-1){
            return -1;
        }
        return linearSearch(arr, target, i+1);
    }


    // linear search for more than one elements
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearch2(int[] arr, int target, int i){
        if(i == arr.length){
            return;
        } 
        if(arr[i] == target){     
            list.add(i);
        } 
        linearSearch2(arr, target, i+1);
    }

    // Important // Return the list but inside the recursion body not in arguements // normally dont use the approach instead use upper one
    static ArrayList<Integer> LS2(int[] arr, int target, int i){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(i == arr.length-1){
            return list2;
        }
        if(arr[i] == target){
            list2.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = LS2(arr, target, i+1);
        list2.addAll(ansFromBelowCalls);
        return list2;
    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,9}; 
        int index = 0;
        int target = 7;
        sorted(arr, index);

        System.out.println("the element index : "+linearSearch(arr, target, index));

        int[] arr2 = {2,2,5,6,6,6,7,9};
        int target2 = 6;
        linearSearch2(arr2, target2, index);
        System.out.println(list);

        System.out.println(LS2(arr, target, index));

    }
}
