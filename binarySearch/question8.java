// find the element in the rotated sorted array
// rotated means the last element comes to first first index 
public class question8 {
    // step to solve find the pivot element -> pivot means the largest element
    static int peak(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end-start)/2);

            if(target == mid){
                return mid;
            }
            if(arr[start] <=  arr[mid]){
                // increasing part
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                // decreasing part
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return start;
    }
    // step 2 : search in first half from (0 to pivot)
    // step 3 : search in second half from (pivot to arr.length -1)
    
    
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,3,4};
        int target = 8;
        int pivot = peak(arr, target);
        System.out.println("the index : "+pivot);
    }
}
