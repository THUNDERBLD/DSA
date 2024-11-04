import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        
        // Standard approach 
        // switch (name) {
        //     case "ali":
        //         System.out.println("lullo");
        //         break;
        //     case "mahanajaf":
        //         System.out.println("Nigga man");
        //         break;
        //     case "hacha":
        //         System.out.println("Lips Bibkey");
        //         break;
        //     default:
        //         System.out.println("not found");
        // }


        // New approach 
        // switch(name){
        //     case "ali" -> System.out.println("hagiman");
        //     case "mahanajaf" -> System.out.println("lil Nigga");
        //     case "hacha" -> System.out.println("Lips Bibkey");
        //     default -> System.out.println("not found");
        // }


        // another approach
        int num = sc.nextInt();
        switch(num){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekends");
            default -> System.out.println("invalid day");
        }

    }
}
