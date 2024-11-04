public class loopsAndConditions {
    public static void main(String[] args){
        // loops
        int count = 1;
        while(count <=5){ // when u dont know how many times the loop is going to run then use while loop
             System.out.println(count);
             count++;
        }

        int n = 1;
        do {
            System.out.println("thunder"); 
            n++;
        } while (count <= 5);

        for(int i = 1; i<=10; i++){ // when u know how many times the loop is going to run then use while loop
            System.out.println(i);
        }

        // if else condition
        int a = 4;
        if(a>10){
            System.out.println("a is greater then 10");
        } else if(a == 10){
            System.out.println("a is equal to 10");
        } else if(a != 10){ // this will run first, because it matches first from the condition
            System.out.println("a is not equal than 10");
        } else {
            System.out.println("a is smaller than 10");
        }
    }
}

