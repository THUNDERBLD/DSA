// find weather the number is a power of 2

public class question8 {
    static void firstApproach(int num) {
        int counter = 0;
        for (int i = 0; i < num/2; i++) {
            int ans = 1 << i;
            if(ans == num){
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("the number is power of two");
        } else {
            System.out.println("the number is not the power of two");
        }
    }

    // check in binary format then u will get it how the answer is coming
    static void secondApproach(int num){
        int newNum = num-1;
        int val = num & newNum;
        if(val == 0){
            System.out.println("the number is power of two");
        } else {
            System.out.println("the number is not the power of two");
        }
    }
    public static void main(String[] args) {
        int num = 16;
        firstApproach(num);
        secondApproach(num);

    }
}
