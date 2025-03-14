

// creating class 
class Student {
    String name;
    int age;
    String grade;

    void greeting() {
        System.out.println("Hey there, I am "+ this.name);
    }

    // creating constructor
    Student(){
        System.out.println("Student object created");
        name = "Student";
        grade = "A";
    }

    // doing constructor overloading and also creating a parameterized constructor
    Student( String studentName, int StudentAge, String StudentGrade ) {
        System.out.println("Student object created with given parameters");
        // what this keyword actually does is, it replace itself with object instance variable name that means -> this.name is objectVariable.name or we can say in this case is, faraz.name or ayan.name
        this.name = studentName;      // this keyword is used for assign values to the above variables from the parameters  
        this.age = StudentAge;        // here above variables are name name, age and grade therefore we are using "this" keyword to target and assign them the values coming from parameters. 
        this.grade = StudentGrade;
    }
}

public class classesAndObjects{

    public static void main(String[] args) {
        //  creating a object from the class.
        //  (className) (instanceVariableName) = new (constructorOfThatClass)   -> here new keyword is used to create a object and then we are assigning it to instance variable 
        // className is the data type for the instance variable in there.
        // a constructor is the basically basically defines what happen when the object is created -> it is a special type of function in class and once a object is created the constructor automatically executes itself, a constructor has the same name as class and it don't have any data type.
        Student faraz = new Student();
        // if you want to access the element inside the object then use .(dot) operator to do it, just like we do in javascript.
        faraz.name = "Faraz";   // if we comment out this overrided values then either it will take values from constructor of the class otherwise it takes default value like null or 0      
        System.out.println("Name : "+faraz.name + "\n" + "Grade : "+faraz.grade + "\n" +  "Age : "+faraz.age);
        faraz.greeting();

        // these objects we are creating is stored in the heap memory. Other things like functions and premitive data types (int, float, char, etc.) are stored in the stack memory 
        Student ayan = new Student("ayan", 19, "A");
        System.out.println("Name : "+ayan.name + "\n" + "Grade : "+ayan.grade + "\n" +  "Age : "+ayan.age);
        ayan.greeting();
    }
}