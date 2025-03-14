// Steps to Solve binary search questions
// First step create a starting and ending index of in the sorted array (only applicable to the sorted or reverse array)
// Second run a loop from start to end and find the middle element of the array, now check if targetElement is < middleElement => search in the left side from the middle.
//     else targetedElement > middleElement => search in the right side from the middle element
//     Now we can see that searching space is dividing into 2 parts that means divided by 2 
// Third step if middleElement == targetedElement then we found our Answer

// Advantage -> according to linear search worst case time complexity for the 1 million elements is N(number of elements) ie. 1 million searches
// where as the binary search only takes 20 comparisions to give output for the 1 million elements...
// worst case time complexity for the binary search is log2 (N)
public class binarySearch{

    static int AscendingOrderSearch(int[] arr, int Target){
        int start = 0;
        int end = arr.length-1;
        
        for (int i = 0; i < arr.length; i++) {
            // mid = (start + end)/2  -> we are not using this because it can easily exceads the range of Integer
            int mid = start + ((end - start)/2); // this one can not easily exceads the range of integer
            if(Target < arr[mid]){
                end = mid - 1;
            } else if(Target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int DescendingOrderSearch(int[] arr, int Target){
        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int mid = start + ((end-start)/2);
            if(Target < arr[mid]){
                start = mid + 1;
            } else if(Target > arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // using while loop for descending order 
    // static int Search(int[] arr, int Target){
    //     int start = 0;
    //     int end = arr.length-1;

    //     while(start <= end) {
    //         int mid = start + ((end-start)/2);
    //         if(Target < arr[mid]){
    //             start = mid + 1;
    //         } else if(Target > arr[mid]){
    //             end = mid - 1;
    //         } else {
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }


    public static void main(String[] args) {
        int[] arr = {-11,-8,-4,0,1,4,6,7,8,9,15,22};
        // int[] arr2 = {44,33,22,18,10,4,1,0,-1,-6,-11};
        int Target = -11;
        int ans = AscendingOrderSearch(arr, Target); 
        // int ans = Search(arr2, Target);
        if(ans >= 0){
            System.out.println("the element is found at index : "+ans);
        } else {
            System.out.println("element is not found");
        }
    }
    
}