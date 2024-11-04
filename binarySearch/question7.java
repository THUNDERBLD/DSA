// find the targeted element in the mountain array
public class question7 {

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + ((end - start)/2);
            if(arr[mid] < arr[mid + 1]){
                // increasing part
                start = mid + 1;
            } else if(arr[mid] > arr[mid+1]){
                // decreasing part
                end = mid;
            }
        }
        return start;
    }

    static int Search(int[] arr, int target, int start, int end){
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

    static int ans(int[] arr, int target){
        int peak = peakElement(arr);
        int ans = Search(arr, target, 0, peak);
        if( ans != -1){
            return ans;
        } 
        return Search(arr, target, peak+1, arr.length-1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,4,3,2,1};
        int target = 2;
        int val = ans(arr, target);
        System.out.println("The index : "+val);
        System.out.println("The Val : "+arr[val]);

    }
}
