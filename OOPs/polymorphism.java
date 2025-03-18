// polymorphism -> act of representing the same thing into multiple ways
// there are 2 types of polymorphism
// 1. compile time/static polymorph -> achived via method(function) overlaoding -> same name of method but different return type of that function or same name of method but different number of parameters and different data types of those parameters.
//          for example : constructors overloading or method overloading and even by operator overloading but java dont support operator overloading.
// 2. runtime/dynamic polymorphism -> achived by method overriding -> when the method in child class is similar to parent class like like return type and same name and 100% similar parameter and same return type of parameters but inside functionality( function body ) of that method is different(changed) then it is called method overriding.
//          for example : parent class have display method which have void return type and it prints "hello parent" and child also class have display method which have void return type and but this print "hello childs", that means display method is getting overridden by child class.

// Dynamic Method Dispatch:
// Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than
// compile time. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.
// Let’s begin by restating an important principle: a superclass reference variable can refer to a subclass object.
// When an overridden method is called through a superclass reference, Java determines which version of that method to
// execute based upon the type of the object being referred to at the time the call occurs. Thus, this determination is
// made at run time.
// In other words, it is the type of the object being referred to (not the type of the reference variable)
// that determines which version of an overridden method will be executed.

// If B extends A then you can override a method in A through B with changing the return type of method to B.


class newParent{
    void display(){
        System.out.println("hello parent");
    }

    final int sum(int a, int b){
        return a + b;
    } 

    static int sub(int a, int b){
        return a - b;
    }

    // lets override the already existing method in java.
    @Override
    public String toString(){
        return "this is parent class overrided toString() method";
    }


}

class newChild extends newParent{
    // annotation, only used for checking purposes
    @Override   // this is just a annotation and it only tells us that weather that function can be overridden or not, if the function cannot be overridden then it will give error otherwise it wont give error.
    void display(){
        System.out.println("hello childs");
    }

    // lets try to override the final method --> well let me make it clear that, it is not possible to override the final method/variable in java, if we try to override the final method then it will give error. 
    // @Override
    // int sum(int a, int b){ }   // giving error because we are trying to override the final method.

    // lets try to override the static method --> well let me make it clear that again, it is not possible to override the static method/variable in java, if we try to override the static method then @Override will give error because static method dont depends on objects therefore everytimes only parent method will run, child method wont get a chance to execute therefore no overriding. 
    // basicaly overriding depends on objects and the static dont depends on objects, therefore no overriding.
    // @Override
    // int sub(int a, int b){ }   // giving error because we are trying to override the static method.
}


public class polymorphism{
    // method overloading
    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static double sum(double a, double b){
        return a + b;
    } 

    public static void main(String[] args) {
        System.out.println(sum(5,10));   
        System.out.println(sum(10,20, 30));
        System.out.println(sum(2.5, 10));

        newParent parentObj = new newParent();   // Reference type is newParent and object is also newParent // this is also a example of Early Binding because it is Resolved at Compile-time
        parentObj.display();               
        System.out.println(parentObj);       // normally it give package name + file name + @ + hashcode of the object, but if we override the toString() method then it will give the output whatever we want of that method.
        // Reference type is newParent, but object is newChild  // this is also a example of Late Binding because it is Resolved at Runtime 
        newParent childObj = new newChild();  // which method will be called depends on the constructor, like type of the object should always be superclass and constructor should always be subclass.
        childObj.display();
    }
}