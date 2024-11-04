// lets see how we can take the input and the output from the java 

// package DSA\2.basicsOfJava
import java.util.*;

public class inputAndOutput{
  public static void main(String[] args){
    Scanner input1 = new Scanner(System.in);
    System.out.print("Please give the Input1 : ");
    int num1 = input1.nextInt();
    System.out.print("Please give the Input2 : ");
    int num2 = input1.nextInt();
    int sum = num1 + num2;
    System.out.println("sum is :"+ sum);

    System.out.print("Please enter the Name : ");
    Scanner input2 = new Scanner(System.in);
    String sc = input2.nextLine();
    System.out.println("Your Name no. : "+sc);

  }
}
