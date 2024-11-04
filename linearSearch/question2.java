// Search the element from the array within a specific range 

import java.util.Scanner;

public class question2 {
    static int Search(int[] arr,int n, int start, int end){
        if(arr.length == 0){
            System.out.println("Array dont have elements!!");
            return 0;
        }
        for (int i = start; i < end; i++) {
            if(arr[i] == n){
                return i;
            }
        } return -1;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Enter the value to search : ");
        int n = sc.nextInt();
        System.out.print("Starting search Index : ");
        int start = sc.nextInt();
        System.out.print("Ending search Index : ");
        int end = sc.nextInt();
        
        int val = Search(arr, n, start, end);
        if(val >= 0){
            System.out.println("the element is found on index : "+val);
        } else {
            System.out.println("Element is not found within the range!!");
        }
    }
}
