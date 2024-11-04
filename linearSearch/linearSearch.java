import java.util.*;

public class linearSearch{
    // linear search means start sreaching for the element line wise
    static int Search(int[] arr, int n){
        if(arr.length == 0){
            System.out.println("array is empty");
        } else {
            for(int i=0; i < arr.length; i++){
                if(arr[i] == n){
                    System.out.print("The number found at index : ");
                    return i;
                } 
            } 
        }
        return -1; 
    }

    // OR
    
    static int Search2(int[] arr, int n){
        if(arr.length == 0){
            System.out.println("array is empty");
        } else {
            for(int i : arr){
                if(i == n){ // it wont give u index, rather it will give u the actual value. 
                    System.out.print("The number found at index : "); 
                    return i;
                } 
            } 
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,45,6,7,8,9,10};
    
        int val1 = Search(arr, n);
        System.out.println(val1);

        int val2 = Search2(arr, n);
        System.out.println(val2);
    }
}