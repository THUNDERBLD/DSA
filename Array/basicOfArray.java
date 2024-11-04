import java.util.*;
public class basicOfArray{
    public static void main(String[] args){
        // int[] arr -> this is just declaration of array. arr is jusy getting defined in stack
        // new int[2] -> initialization: actually here object is being created in the memory(heap) \
        // new is used to create a object 
        // remember stack points towards heap memory
        int[] arr = new int[3];
        arr[0] = 22;
        arr[1] = 44;
        arr[2] = 45;
        System.out.println(Arrays.toString(arr));
        
        // or 
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr2));
 
        // Input and Output using a for loop in array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr3 = new int[n];
        //Input in the array
        for(int i=0; i < arr3.length; i++) { 
            arr3[i] = sc.nextInt();
        }
        //Output in the array
        System.out.print("old way of printing : ");
        for(int i=0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        } System.out.println(); // just for going to the new line 

        // OR use the foreach loop for output
        System.out.print("new way of printing : ");
        for(int i: arr3){
            System.out.print(i+" ");
        }
    }
}