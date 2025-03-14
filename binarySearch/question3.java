// Ceiling problem (get the smallest element which is greater then equal to the target value using binary search) in the string elements
public class question3 {
    
    static int Search(int[] arr, int target){
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; start <= end; i++) {
            int mid = start + ((end - start) / 2);
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
        int[] arr = {'a','c','e','f','h'};
        int target = 'd';
        int ans = Search(arr, target);
        if(ans == -1){
            System.out.println("the element is not found");
        }
        else if(arr[ans] == target){
            System.out.println("the element is found at index : "+ans);
        } else {
            char cel = (char) arr[ans];
            System.out.println("the ceiling element : "+cel+" at index : "+ans);
        }
    }
}
