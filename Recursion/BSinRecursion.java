public class BSinRecursion {

    static int Search(int[] arr, int target, int start, int end){

        int mid = start + ((end - start)/2);

        if (start > end ) { 
            return -1;
        }
        if(target == arr[mid]) {
            return mid;
        }
        if(target < arr[mid]){
            return Search(arr, target, start, mid-1);  // must return because we are using static int(type of function) 
        } 
        return Search(arr, target, mid+1, end);
    }



    // binary search on rotated array
    static int pivot(int[] arr, int i){
        if(arr[i] >= arr[i+1]){
            return i;
        }
        return pivot(arr, i+1);
    }
    static int leftSideBS(int[] arr, int target, int start, int end){
        int mid = start + ((end-start)/2);
        if(start > end){
            return -1;
        }
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]){
            return leftSideBS(arr, target,start, mid-1);
        }
        return leftSideBS(arr, target, mid+1, end);
    }
    static int rightSideBS(int[] arr, int target, int start, int end){
        int mid = start + ((end-start)/2);
        if (start > end) {
            return -1;
        }
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]){
            return rightSideBS(arr, target,start, mid-1);
        }
        return rightSideBS(arr, target, mid+1, end);
    }
    static void rotatedBinarySearch(int[] arr, int target, int start, int end){
        int pivot = pivot(arr, 0);
        int leftAns = leftSideBS(arr, target, start, pivot);
        int rightAns = rightSideBS(arr, target, pivot+1, end);
        if(leftAns > 0){
            System.out.println("the pivot element is found at index : "+ leftAns);
        } else if (rightAns > 0)
            System.out.println("the pivot element is found at index : "+ rightAns);
        }

    // Another approach for the rotated array binary search algorithm.
    // this code is wokring perfectly fine and dont overthink it -> watch shradha dede video for understanding rotated array binary search algorithm.
    // in this question dont worry about the pivot element, algorithm will automatically get that.
    // static int Bs(int[] arr, int target, int start, int end){
    //     int mid = start + ((end-start)/2);
    //     if(start > end){
    //         return -1;
    //     }
    //     if(arr[mid] == target){
    //         return mid;
    //     }
    //     // if the array's left half is sorted then search inside that sorted part
    //     if(arr[start] <= arr[mid]){
    //         if(target <= arr[mid] && target >= arr[start]){
    //             return Bs(arr, target, start, mid -1);
    //         } else {
    //             return Bs(arr, target, mid+1, end);
    //         }
    //     } else { // if the arrays right half is sorted then search inside that sorted part
    //         if(target >= arr[mid] && target <= arr[end]){
    //             return Bs(arr, target, mid+1, end);
    //         } else {
    //             return Bs(arr, target, start, mid -1);
    //         }
    //     }
    // }
    


    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9};
        int target = 9;
        int start = 0;
        int end = arr.length -1;
        int ans = Search(arr, target, start, end);
        System.out.println("The index : "+ans);


        // rotated array binary search using pivot element
        int[] arr3 = {7,8,9,10,12,1,2,3,4,6};
        int target3 = 4;
        rotatedBinarySearch(arr3, target3, 0, arr3.length-1);

        // for last approach
        // int[] arr4 = {7,8,9,10,12,1,2,3,4,6};
        // int target4 = 4;
        // int ans = Bs(arr3, target3, 0, arr4.length-1);
        // System.out.println(ans);
    }
}
