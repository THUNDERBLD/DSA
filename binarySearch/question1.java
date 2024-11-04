// Ceiling problem (get the smallest element which is greater then equal to the target value using binary search)
public class question1 {
    
    // My approach
    static int Search(int[] arr, int target){ 
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int some = 0;
        for (int i = 0; i < arr.length; i++) {
            int mid = start + ((end-start)/2);
            if(target < arr[mid]){
                end = mid - 1;
                some = mid;
            } else if(target > arr[mid]){
                start = mid + 1;
                some = mid;
            } else {
                return mid;
            }
        }
        return some;
    }

    // Better approach
    static int Search2(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        for(int i = 0; start <= end; i++){ // OR    while(start <= end){   -> it will work the same
            int mid = start + (( end - start )/2);
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = start + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,10,14,17};
        int target = 13;
        int ans = Search2(arr, target);
        // int ans = Search(arr, target);  //--> if using my approach for finding the floor value the just subtract the ans by 1 ( ans = ans - 1) 
        if(ans == -1){
            System.out.println("the element is not found");
        }
        else if(arr[ans] == target){
            System.out.println("the element is found at index : "+ans);
        } else {
            int cel = arr[ans];
            System.out.println("the ceiling element : "+cel+" at index : "+ans);
        }
    }
}
