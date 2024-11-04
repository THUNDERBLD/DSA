// find the total number of set bits in the number

public class question10 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(Integer.toBinaryString(num));
        int counter = 0;
        while(num > 0){
            if((num & 1) == 1){
                counter++;
            }
            num = num >> 1;
        }
        System.out.println(counter);
    }
}
