public class euclidenAlgo {

    static int HCF(int num1, int num2) {
        if(num1 == 0){
            return num2;
        }
        return HCF(num2 % num1, num1);
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 45; 
        System.out.println(HCF(num1, num2));
    }   
}
