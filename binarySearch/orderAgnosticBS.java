public class orderAgnosticBS {
    // Order agnostic binary search( Basically we are not sure weather an array is sorted or in ascending or descending order )
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        for (int i = 0; i < arr.length; i++) {
            int mid = start + ((end - start)/2);
            boolean isAscending = arr[start] < arr[end];

            if(target == arr[mid]){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1; 
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(target < arr[mid]){
                    start = mid + 1;
                } else if(target > arr[mid]){
                    end = mid - 1; 
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-11,-8,-4,0,1,4,6,7,8,9,15,22};
        int Target = 15;
        int ans = Search(arr, Target);
        if(ans >= 0){
            System.out.println("the element is found at index : "+ans);
        } else {
            System.out.println("element is not found");
        }

    }
}
