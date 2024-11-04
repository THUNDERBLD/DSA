// calculate a^b without using Math.pow()

public class question9{
    public static void main(String[] args) {
        int a = 3;  // 011
        int b = 4;  // 100
        int ans = 1;
        while (b > 0) {
            if((b & 1) == 1) {
                ans = ans * a;
            }
            a = a*a;
            b = b >> 1;
        }
        System.out.println(ans);
    }
}