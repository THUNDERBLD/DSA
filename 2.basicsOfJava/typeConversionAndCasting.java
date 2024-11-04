public class typeConversionAndCasting {
    public static void main(String[] args){
        // type casting
        //sometimes type casting happens automatically like from float to int
        int a = (int)(75.99f);
        System.out.println(a);

        int val = 'A'; // output is ASCII value of A, ie. 65
        System.out.println(val);
        // String s = (char)("thunder blood");
        // System.out.println(s);


        // Automatic type promotion in expression
        int e = 257;
        byte b = (byte)(e);
        System.out.println(b); // output is 1 because max range of byte is 256
    }
}
