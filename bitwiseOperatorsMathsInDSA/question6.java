// count the number of digits in binary

public class question6{

    static void firstApproach(int num) {
        int counter = 0;
        while(num > 0){
            num = num >> 1;
            counter++;
        }
        System.out.println("The first approach : "+counter);
    }

    // better time complexity of log(n)
    static void secondApproach(int num) {
        int base =2;
        int ans = (int) (Math.log(num)/ Math.log(base))+1;
        System.out.println("The second approach : "+ans);
    }
    public static void main(String[] args) {
        int num = 10;
        firstApproach(num);
        secondApproach(num);
    }
}