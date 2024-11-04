// Find the minimum element in the array
import java.util.Scanner;

public class question3 {
    // first approach
    static int Sorting(int[] arr){ 
        int min;
        if(arr.length == 0){
            System.out.println("Array dont have elements!!");
            return 0;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[i] > arr[i+j]){
                    int temp = arr[i];
                    arr[i] = arr[i+j];
                    arr[i+j] = temp;
                }
            }
        }
        min = arr[0];
        return min;
    } 
    
    // better approach
    static int Search(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        } return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int max = Integer.MIN_VALUE; // it will give u the maximum value of integer ie. 2147483647, similary there is a Integer.MIN_VALUE for integer minimum value ie. -2147483648
        // System.out.println(max);
        int[] arr = {11,8,7,441,53,66};
        int val = Sorting(arr);
        System.out.println("the minimum element in arr by sorting : "+val);
        
        int val2 = Search(arr);
        System.out.println("the minimum element in arr by linearSearch : "+val2);

    }
}
