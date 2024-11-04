public class shadowing {
    // shadowing means the two same name variable having different values in different scopes get changed because of reinitializaion.
    // have to use static because we dont want this variable or the functions to depends on objects, using static makes the variable independent. 
    // eg for all people the population of the world is same, here population of the world is static.
    static void thunder(){
        String name = "Shadowing me";
        System.out.println(name);
    }
    
    static int x = 200; 
    public static void main(String[] args) {
        System.out.println("value of x before reinitializing : "+x);
        int x = 100;
        System.out.println("value of x after reinitializing : "+x);
        thunder();
    }
}
