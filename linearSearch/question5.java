// find the total digit in the number and find weather the digits are odd in number or even in number   

import java.util.Arrays;


public class question5 {

    static int val(int i){
        int counter = 0;
        int a = i;
        while (i > 0) {
            i = i/10;
            counter++;
        }
        if(counter%2 == 0){
            System.err.println("The digits in the number is Even "+a);
        } else{
            System.out.println("The digits in the number is Odd "+a);
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] arr = {12,33,20,133,145,258,90,12356};

         // Pure Maths and inbuild function approach
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = arr[i] * -1;
            }
            int count = (int)(Math.log10(arr[i])+1);
            System.err.println(count); 
        }

        // String approach 
        // int[] newArr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     String a = arr[i] + "";
        //     newArr[i] = a.length();
        //     if(a.length()%2 == 0){
        //         System.out.println("The digits in the number is Even "+a);
        //     } else {
        //         System.out.println("The digits in the number is Odd "+a);
        //     }
        // }
        // System.out.println("The digit of each element in array : "+Arrays.toString(newArr));



        // Mathematical approach
        // int[] newArr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     int count = val(arr[i]);
        //     newArr[i] = count;

        // }
        // System.out.println("The digit of each element in array : "+Arrays.toString(newArr));

        
       
    } 
}

