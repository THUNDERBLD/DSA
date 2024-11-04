// find weather a number is prime or not

public class question14{
    // normal method, time complexity is O(sqrt(n))  -> better time complexity
    static boolean isPrime(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method for finding the prime number from 0 to n, time complexity is O(n log(log(n)))
    static void rangePrime(int n, boolean[] primee){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // all the intital boolean element inside the primee is false
            if(primee[i] == false){
                for (int j = i*2; j <= n; j+=i) {
                    primee[j] = true;                    
                }
            }

        }
        for (int i = 2; i <= n; i++) {
            if(primee[i] == false) {
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        int num = 37;
        if (isPrime(num)) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not Prime");
        }

        // for second method 
        int n = 40;
        boolean[] primee = new boolean[n+1];
        rangePrime(n, primee);
    }
}