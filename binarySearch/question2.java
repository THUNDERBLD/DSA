// Floor problem (get the larget element which is smaller then equal to the target value using binary search)
public class question2 {
    static int Search2(int[] arr, int target){
        if(target < arr[0]){
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,10,14,17};
        int target = 2;
        int ans = Search2(arr, target);
        if(ans == -1){
            System.out.println("element is not found");
        } else if (arr[ans] == target) {
            System.out.println("the element is found at index : "+ans);
        } else {
            int flo = arr[ans];
            System.out.println("the Floor element : "+flo+" at index : "+ans);
        }
    }
}
