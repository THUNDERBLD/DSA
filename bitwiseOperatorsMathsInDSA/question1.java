// Find the number is even or odd

public class question1{
    static boolean isEven(int n){
        return (n & 1) == 0;
    }
    public static void main(String[] args) {
        int n = 44;
        if (isEven(n)) {
            System.out.println("n is even");
        } else {
            System.out.println("n is odd");
        }
    }
}