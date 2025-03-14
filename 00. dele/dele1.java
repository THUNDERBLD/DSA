
public class dele1{
    static int bs(int[] arr, int target, int start, int end){
        for(int i = 0; i < arr.length; i++){
            int mid = start + ((end - start)/2);
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    static public void main(String[] args) {
        int[] arr = {1,4,5,7,8,9,12};
        int target = 6;
        int ans = bs(arr, target, 0, arr.length);
        System.out.println("THUNDER BLOOD");
        System.out.println(ans);
    }
}