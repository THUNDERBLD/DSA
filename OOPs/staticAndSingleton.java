
class Human{
    String name;
    int age;
    String gender;
    int salary;
    // static make the variable or method available for all object without depending on any perticular object 
    // for example faraz and ayan both have same population for the earth that is why it is static, because its not depending on ayan object or faraz object.
    // The most common example of a static member is main( ).
    // main( ) is declared as static because it must be called before any objects exist.
    // Static method in Java is a method which belongs to the class and not to the object.
    static int population = 0;

    Human(String name, int age, String gender, int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        // here u can use "this" keyword instead of using class name here but that is not the best convention for writing it.
        Human.population += 1;  // best convention is to use class name because it will just directly access the variables present in class, whereas "this" keyword will first check weather the variables is present in the object then if it dont find variable in the object, so it search in class.
    }

}

// Singleton class are the type of classes which can have only one instance and if we create more than one object then it will assign same instance to all the objects. 
class singleton{
    private singleton() {

    }
    private static singleton instanceName;

    public static singleton getInstance(){
        // check weather 1 object is created only
        if(instanceName == null){
            instanceName = new singleton();
        }
        return instanceName;
    }
}

public class staticAndSingleton {
    
    void greeting(){
        System.out.println("Hey there, I am ayan");
    }


    public static void main(String[] args){
        
        Human ayan = new Human("Ayan", 19, "Male", 70000);
        Human faraz = new Human("Faraz", 18, "Male", 90000);
        Human thunder = new Human("thunder", 19, "Male", 100000);
        
        
        System.out.println("Population for ayan : "+ayan.population);   // this will also working similar to "this" keyword and it is not a good convention
        System.out.println("Population for faraz : "+Human.population);  // working similar to class name and it is a good convention
        System.out.println("Population for faraz : "+Human.population);

        // here we are directly accessing the static variable population without creating any object. This is called static variable or method.
        // basically you dont even have to create object for accessing the static variable or methods, for example
        // System.out.println("Population : "+Human.population);

        // greeting();  --> we cannot access it because it is not static and we are trying to access it in static method. as we know something which is not static will surely belongs to the object 
                        // you simply cant use this because it requires instance of object but we are currently in static method which does not depends on instance of object

        // both reference variables are pointing to the same object
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();

    }

}
