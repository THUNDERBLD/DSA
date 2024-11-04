// add all the divisor of number(user input) with previous number divisor
// eg => num = 4 then output = 15 
// cause( addition of divisor of 4 are 1+2+4=7 and divisor of 3 are 1+3=4 and divisor of 2 are 1+2=3 and divisor of 1 is 1)
// now add all the final valuse ie. 7+4+3+1 = 15 | this is how 15 come as output
public class question1{

    static int val(int num, int storage, int x) {
        for(int i = 1; i <= x; i++){
            if(num%i == 0){
                storage = storage + i;
            }
        }
        return storage;
    }

    static int val2(int num, int storage, int x){
        int zz = 0;
        for(int i = 1; i <= x; i++){
            int some = val(num, storage, x);
            zz = zz + some;
            num--;
        }
        return zz;
    }

    public static void main(String[] args) {
        int num = 5;
        int storage = 0;
        int x = 5;
        int ans = val2(num, storage, x);
        System.out.println("The ans : "+ans);
    }
}
