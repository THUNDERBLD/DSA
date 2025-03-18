// abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Abstraction lets you focus on what the object does instead of how it does it.
// Abstraction is achieved by using abstract classes and interfaces.
// An abstract class is a class that is declared abstract, it may or may not include abstract methods.
// Abstract classes cannot be instantiated, but they can be subclassed.    
// An abstract method is a method that is declared without an implementation.
// Abstract classes may have abstract methods that are not implemented in the abstract class, but in subclasses.
// If a class includes abstract methods, then the class itself must be declared abstract.
// An abstract class can have both abstract and non-abstract methods.

// abstract class
abstract class parents {
    // fields
    int age;

    // constructor
    parents(int age) {
        this.age = age;
    }
    // abstract method -> if there is one or more abstract methods in a class, the class must be declared abstract
    public abstract void career();
    public abstract void partner(); 

    // non-abstract method
    public void normalMethod() {
        System.out.println("My age is " + age);
    }
}

class son extends parents {
    // constructor
    public son(int age) {
        super(age);
    }
    // as you know that abstract methods are only functions with parameters without body that means we have to override them in the subclasses to provide the body of the method
    @Override
    public void career() {
        System.out.println("I am a programmer");
    }
    @Override
    public void partner() {
        System.out.println("I love mikasa");
    }
}

class daughter extends parents {
    // constructor
    public daughter(int age) {
        super(age);
    }

    // you cannot create abstract constructors or methods because if we create a abstract constructor or method then both the constructor and method dont have body and if we run it while creating object then it will give error becase there is no body of construct or method.
    // abstract daughter(int age);

    // you cannot create abstract static methods because abstract methods are instance methods that must be overridden in the subclass and depends on object, whereas static methods dont depend on objects
    // abstract static void daughters(int age);

    // basically there is no objects for abstract classes

    @Override
    public void career() {
        System.out.println("I am a doctor");
    }
    @Override
    public void partner() {
        System.out.println("I love eren");
    }
}

public class abstraction {
    public static void main(String[] args) {
        son s = new son(20);
        daughter d = new daughter(22);
        s.career();
        d.career();

        // you cannot create objects of abstract class
        // parents dad = new parents();          // giving error

        s.normalMethod();
        d.normalMethod();
    }   
}
