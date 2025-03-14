// Create a calculator for adding two numbers

import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; true ; i++) {
        
            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter opearation number : ");
            String oprator = sc.next();
            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();

        if("+".equals(oprator)){
            int sum = num1 + num2;
            System.out.println("sum : "+ sum);
        } else if("-".equals(oprator)){
            int sub = num1 - num2;
            System.out.println("sub : "+ sub);
        } else if("*".equals(oprator)){
            int mul = num1 * num2;
            System.out.println("sub : "+ mul);
      } else if("/".equals(oprator)){
        int div = num1 / num2;
        System.out.println("sub : "+ div);
    } else if("X".equals(oprator) || "x".equals(oprator)){
        System.out.println("Exiting the program...");
        break;
    }

  }
}
}
