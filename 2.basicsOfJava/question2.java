// check weather the latter is capital or small
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the letter : ");
        String val = sc.next();
        char ch = val.trim().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("the latter "+ch+" is a small letter");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("the latter "+ch+" is a capital letter");
        }
    }
}
