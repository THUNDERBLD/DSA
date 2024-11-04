// find a particular bit(weather it is 0 or 1) on some index

public class question3 {
    // we can set a bit 
    public static void main(String[] args) {
        int n = 10;
        int initial = 1;
        int shifts = 3;
        int mask = initial << shifts;
        int ans = n & mask;
        System.out.println(ans);
    }
}
