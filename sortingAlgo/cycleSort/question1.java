// find the missing number in the array from index 0 to N
// that means arr of [0,3,4,1] -> 2 is the missing element here
public class question1 {

    static int Sort(int[] arr){
        // the element are going from 0 to N
        int i = 0;
        int some = 0;
        while (i<arr.length) {
            int realIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[realIndex]){
                int temp = arr[i];
                arr[i] = arr[realIndex];
                arr[realIndex] = temp;    
            } else {
                i++;
            }
        } 
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return some;
    }
    public static void main(String[] args) {
        int[] arr = {7,0,1,5,4,2,3};
        int ans = Sort(arr);
        System.out.println("the element missing element : "+ans);

    }
}
