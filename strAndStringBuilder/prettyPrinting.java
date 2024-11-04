// these %.2f and %s are know as place holders and f means float, s means string, %c means char, %i means integer
public class prettyPrinting {
    public static void main(String[] args) {
        float a = 324.42224f;
        System.out.printf("formate number is %.2f",a); // in the place of %, the first variable will be added therefore it will become like a.2f
        System.out.println();
        System.out.printf("pie : %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello, My name is %s and i am suding %s", "Faraz Haider", "CSE");
    }
}
