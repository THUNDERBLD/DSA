// find the missing smallest positive integer in the array with the O(N) time complexity
// eg -> arr = [7,8,9,11,12] -> ans = 1    another example arr = [1,2,0] -> ans = 1     another example arr = [3,4,-1,1] -> ans = 2


public class question6 {

    static int Sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int realIndex = arr[i] - 1;
            // Make sure arr[i] is in the correct range and not already in the correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[realIndex]) {
                // Swap arr[i] and arr[realIndex]
                int temp = arr[i];
                arr[i] = arr[realIndex];
                arr[realIndex] = temp;
            } else {
                i++;
            }
        }
        // Now, check for the first missing positive integer
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1; // Missing positive integer
            }
        }
        return arr.length + 1; // If all numbers are in place, return the next integer
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 0};
        int ans = Sort(arr);
        System.out.println("The missing smallest positive integer : " + ans);
    }
}
