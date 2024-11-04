import java.util.Scanner;

public class functionAndMethods {
    
    // this method wont return anything because it is of type void
    static void printing(String name){
        System.out.println("Thunder Blood : "+name);
    }

    // this function will return int according to its data type
    static int addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum; // at the return line the work of the function is over 
    }

    // function with arguments and parameters
    static int substraction(int num1, int num2){
        System.out.println("number 1 : "+num1+ "\nnumber 2 : "+num2);
        int sub = num1 - num2;
        return sub;
    }

    public static void main(String[] args) {
        printing("faraz");
        
        int val1 = addition();
        System.out.println("Sum : "+val1);

        int val2 = substraction(44, 33);
        System.out.println("Substraction : "+val2);
    }
}
