// Kadanes Algo is used for finding the maximum sum of subArrays in the most optimized way

class kadaneAlgorithm{
    // First we need to understand what is subarray -> a sub array is a continious elements of array which have a starting index and ending index.
    // eg. arr = [1, 2, 3]  => formula for finding the number of sub arrays is (n(n+1))/2.
    // then subarrays are -> [1,2,3], [1,2], [2,3], [1], [2], [3].
    static void printSubArrays(int[] arr){                    // code for printing sub arrays
        for(int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                for(int i = start; i <= end; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // using the kadanes algo here
    // Steps to solve the Algo. 
    // 1. Initialize currentSum = 0 and maxSum = first element of array.
    // 2. Iterate through the array from the first element to last element then add all the elements to the currentSum one by one.
    // 3. then check which is maximum element between the currentSum and maxSum and assign it to maxSum.
    // 4. make a if condition that if currentSum is < than 0 then put the currentSum = 0
    // 5. Just return the maxSum 
    static int maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = arr[0];
        for(int i = 0; i < arr.length; i++){
            currentSum = currentSum + arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println();
        // printSubArrays(arr);
        int ans = maxSubArray(arr);
        System.out.println(ans);

    }
}