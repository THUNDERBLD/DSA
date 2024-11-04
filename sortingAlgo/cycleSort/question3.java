// find the dublicate element in the array from element 1 to N...
// the no. of element present int the array is N+1...
// there is one repeated number in the array, so just find it...

public class question3 {

    static int Sort(int[] arr){
        int i = 0;
        // first approach
        // int storage = 0;
        // while (i < arr.length) {
        //     int realIndex = arr[i] - 1;
        //     if(arr[i] != arr[realIndex]){
        //         int temp = arr[i];
        //         arr[i] = arr[realIndex];
        //         arr[realIndex] = temp;  
        //     } else {
        //         i++;
        //     }
        // }
        // storage = arr[arr.length-1];
        

        // Second approach
        while(i < arr.length){
            if(arr[i] != i+1){
                int realIndex = arr[i] - 1;
                if (arr[i] != arr[realIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[realIndex];
                    arr[realIndex] = temp;  
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;   // return storage if u are using the first approach
    }
    public static void main(String[] args) {
        int[] arr = {3,1,1,2,4};
        int ans = Sort(arr);
        System.out.println("The Duplicate element : "+ans);
    }
}
