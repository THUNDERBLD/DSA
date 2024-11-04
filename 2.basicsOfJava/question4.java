// number of times the digit is repeating itself

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // string spliting approach
        String val = sc.next();
        String arr[] = val.split("");
        int count = 0;
        for(String i : arr) {
            // System.out.println(i);
            if("7".equals(i)){
                count++;
            }
        } System.out.println(count);



        // mathematical approach
        // int val = sc.nextInt();
        // int counting = 0;
        // for(int i = 0; val > 0; i++){
        //     int modulo = val % 10;
            
        //     if(modulo == 7){
        //         counting++;
        //     }
            
        //     val = val / 10;
        // }
        // System.out.println(counting);
    }
}
