// swaping the elements of array of specific index 

import java.util.Arrays;
import java.util.Scanner;

public class question1 {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements needed in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array without swap : "+Arrays.toString(arr));
        
        System.out.print("Enter first index for swap : ");
        int i = sc.nextInt();
        System.out.print("Enter second index for swap : ");
        int j = sc.nextInt();
        swap(arr, i, j);

        System.out.println("Array with Swap : "+Arrays.toString(arr));
    }
}
