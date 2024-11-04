// Reverse Sorting the Array 
import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    static void reverse(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[i] < arr[i+j]){
                    int temp = arr[i];
                    arr[i] = arr[i+j];
                    arr[i+j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements needed in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array without reverse : "+Arrays.toString(arr));
    
        reverse(arr);

        System.out.println("Array with reverse : "+Arrays.toString(arr));
    }   
}
