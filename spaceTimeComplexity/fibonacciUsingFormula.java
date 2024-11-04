
public class fibonacciUsingFormula {
    static void printFibonacci(int n){
        for(int i = 0; i <= n; i++){
            System.out.println(fibo(i));
        }
    }
    static int fibo(int n){
        return (int) (((Math.pow(((1 + Math.sqrt(5))/2),n)) - (Math.pow(((1 - Math.sqrt(5))/2),n)))/Math.sqrt(5)); 
    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}
