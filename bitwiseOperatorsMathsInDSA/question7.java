// find the sum of the row in pascal's triangle( all the values are in power of 11 )
// pascal's triangle -->  1           (11^0)
                     //   1 1           (11^2) 
                     //   1 2 1           (11^3)
                     //   1 3 3 1           (11^4)
                     //   1 4 6 4 1           (11^5)

public class question7 {
    public static void main(String[] args) {
        int rowNumber = 4;
        int ans = 1 << (rowNumber-1);
        System.out.println(ans);
    }
}
