// inheritance is the ability of class to share its properties across multiple classes by using "extends" keyword.
// final keyword can also prevent inheritance, if we use final keyword with class then it will prevent the inheritance of that class.
// static variable and methods can be inherited from parent class to child class.
class box{
    double length;
    double width;
    double height;

    box () {
        this.length = 50;
        this.width = 20;
        this.height = 30;
        System.out.println("constructor without parameters is called in parent class");
    }

    box (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("constructor with parameters is called in parent class");
    }

    void displayProperties(){
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
}

class boxWeight extends box {
    double weight;

    boxWeight(){
        this.weight = 50;
    }

    boxWeight (double length, double width, double height, double weight) {

        super(length, width, height);   // it is saying call the parent class constructor which have these parameters -> length, width and height and if we dont use "super" keyword then it will automatically call constructor without parameters
                                        // and what we are doing here is getting values from boxWeight constructor and giving them to super(length, width, height), so that it will call the constructor of parent class
                                        // "super" keyword with parameters is basically used for selecting which constructor we have to call and if we dont pass "super" keyword without any parameters or if we dont add 'super' keyword then it will just call default constructor or constructor without the given parameters 
                                        // "super" keyword only points to the just above class constructor like child to parent and parent to grandparent class
        this.weight = weight;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // child class object 1
        // whenever we create a object from child class then it will firstly call the parent class constructor then it will call the child class constructor
        boxWeight obj = new boxWeight();
        System.out.println("Constructor without parameter having weight : "+obj.weight);

        System.out.println("\n");

        // child class object 2
        boxWeight obj2 = new boxWeight(90, 20, 30, 40);
        // calling parent class function using child class
        // obj2.displayProperties();
        System.out.println("weight : " + obj2.weight+ ", length : " + obj2.length);

        System.out.println("\n");

        // we can create the object of parent class using the child class constructor but you cant access the variables on child class constructor because the object is of type parent class which dont knows about the variables of child classes 
        // it is similar to when my father says i am the parent of faraz in parent teachers meeting
        box obj3 = new boxWeight(20, 40, 80, 100);
        System.out.println(obj3.length);        // we can easily access it because length property is present in parent class
        // System.out.println(obj3.weight);  // we can't access it because weight property is not present in parent class whereas it is present in child class and the object is of type parent (box) here.

        System.out.println("\n");

        // think of it like this -> we have so many variables in both parent class and child class and u are given access to variables which is reference type of boxWeight, hence you have access to weight variables.
                                // this also means that the one you are trying to access should be initialized but here when the object is of type child class, how will you call the constructor of parent class, that is why it is giving error.
        // boxWeight obj4 = new box();      // this is not possible
    }
}
