// Fibonacci series using loops
import java.util.Scanner;

public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int num = sc.nextInt();
        int initial = 0;
        int finals = 1;
        for(int i = 1; i < num; i++){
            int newVal = initial + finals;
            initial = finals;
            finals = newVal;
        }
        System.out.println(finals);
    }
}
