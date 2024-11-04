

public class recursion1{
    // print number 1 to n
    static void print(int n){
        // base condition
        // if there is no base condition then function again and again goes into the stack which will fill the memory of the stack
        // after a certain point the memory of the stack is fully filled which will leads to stack overflow condition 
        if(n == 5){   // this is the condition for breaking the recursive loop and coming out the stack 
            return;
        }
        // body of the recursion
        System.out.println(n);
        // recursive call
        print(n+1);
    }

    // print fibonacci number 
    // static void fibonacci(int n, int previous, int starting) {
        
    //     if (n == 5) {
    //         return;
    //     }

    //     System.out.print(previous+", ");
        
    //     int store = previous + starting;
    //     fibonacci(n+1, starting, store);
    // }

    // printing fibonacci series with approach of 2 function calls
    static int fibonacci(int n) {
        
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n*factorial(n-1);
    } 

    public static void main(String[] args) {
        print(1);   // printing the number
        System.out.println("\nnow the fibonacci number of particular index");
        // int n = 1;     // used for first approach
        // fibonacci(n, 0, 1);    // used for first approach
        int n = 5;
        System.out.println(fibonacci(n));

        System.out.println(factorial(n));
    }
}