// find the peak element of the mountain( bitonic ) array
public class question6 {

    static int Search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + ((end-start)/2);
            if(arr[mid] < arr[mid + 1]){
                // here u are in increasing part of the array therefore we are going to look at right side of the array 
                start = mid + 1;
            } else if(arr[mid] > arr[mid + 1]){
                // here u are in decreasing part of the array therefore we are going to look at left side of the array
                end = mid;
            }
        }
        // in the end the start == end and pointing to the largest number
        // start and end are always trying to find the max element in the above 2 conditions 
        // therefore when they are just pointing to the one element then that is the max one;
        return start; // u can even return end
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,3,2,1};
        int ans = Search(arr);
        System.out.println("The index of top element : "+ans);    
    }
}
