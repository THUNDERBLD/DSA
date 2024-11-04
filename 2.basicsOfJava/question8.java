// find all the armstrong number in 3 digit range
public class question8 {
    static int armstrong(int num){
        int sum = 0;
        for(int i = 0; num > 0; i++){
            int rem = num % 10;
            num /= 10;
            int cube = rem*rem*rem;
            sum += cube;
        }
        return sum;
    }
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++){
            int val = armstrong(i);
            if(i == val){
                System.out.println(val);
            }
        }
    }
}
