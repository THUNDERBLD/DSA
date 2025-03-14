// find the largest of the given number 
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter three numbers : ");
        int input1 = sc.nextInt();        
        int input2 = sc.nextInt();        
        int input3 = sc.nextInt();        
        
        
        // one approach is this 
    // if(input1 > input2 && input1 > input3) {
    //     System.out.println("Input number 1 is the largest element, that is " + input1);
    // } else if(input2 > input3 && input2 > input1) {
    //     System.out.println("Input number 2 is the largest element, that is " + input2);
    // } else{
    //     System.out.println("Input number 3 is the largest element, that is " + input3);
    // }

        
        // a good approach is this

        // int max = input1;
        // if(max < input2){
        //     max = input2;
        // } else if(max < input3){
        //     max = input3;
        // }
        // System.out.println("The maximum element value is " + max);


    // another approach using the inbuilt functions for finding the maximum element value
        int max = Math.max(input1, Math.max(input2, input3));
        System.out.println("the greatest element is : "+max);

  }
}
