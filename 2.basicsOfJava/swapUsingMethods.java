import java.util.*;

public class swapUsingMethods {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a+"\nb : "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number1 : ");
        int num2 = sc.nextInt();
        System.out.println("number1 : "+num1+"\nnumber2 : "+num2);

        //swap function call, but it wont swap the actual values of num1 and num2   // the reason behind this is that java dont have pass by reference it only have pass by values
        System.out.println("This is inside the swap function, the actual values is not swaping");
        swap(num1, num2);

        // swap without the function, it will swap the actual values of num1 and num2
        System.out.println("After actually swap the values of num1 and num2");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("new number1 : "+num1+"\nnew number2 : "+num2);

    }
}
