// find the index of the element in the sorted array with the infinite length

public class question5 {
    // In normal binarySearch questions we take a approach of dividing the array by 2 and repeat dividing it until we reach to the targeted element in the array
    // but in this infinite array question, we cant use the arr.length function( we are assuming we dont know the length of the array ).
    // therefore we are going to use chunk of element approach, baiscally we are going to take a index chunk of 2 element then multiply it by 2, therefore next index chunk is of 4 elements and so on.
    // in simple language firstly we are dividing the array by 2 for finding the target and now we are multiple the array by 2 for finding the target.

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            int sizeOfChunk = (end - start + 1);
            start = newStart;
            end = end + (sizeOfChunk*2);
        }
        return Search(arr, target, start, end);
    }

    static int Search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid +1;
            } else {
                return mid; 
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 14;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    
}
