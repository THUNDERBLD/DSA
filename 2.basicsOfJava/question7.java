
import java.util.Scanner;

// Armstrong number checker 
public class question7 {
    static int Armstrong(int num){
        int sum = 0;
        for(int i=0; num>0; i++){
            int rem = num % 10;
            num /= 10;
            int cube = rem*rem*rem;
            sum += cube;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number : ");
        int num = sc.nextInt();
        int sum = Armstrong(num);
        if(sum == num){
            System.out.println(num +" is an armstrong number");
        } else {
            System.out.println(num +" is not an armstrong number");
        }
    }    
}
