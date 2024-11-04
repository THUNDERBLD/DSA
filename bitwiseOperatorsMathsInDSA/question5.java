// find the magic number with base 5
// eg. input = 2(010) and output = 25
// eg. input = 1(001) and output = 5
// eg. input = 6(110) and output = 150
// eg. input = 4(100) and output = 125

public class question5 {
    public static void main(String[] args) {
        int num = 3;
        int ans = 0;
        int base = 5;
        while(num > 0){
            int lastBit = num & 1;
            num = num >> 1;
            ans = ans + (lastBit * base);
            base = base * 5;
        }
        System.out.println(ans);
    }
}
