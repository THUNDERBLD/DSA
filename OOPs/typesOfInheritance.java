// well there are levels of inheritance :- 
// 1. single level inheritance (already completed in inheritance.java file) -> when a single parent class extends extends child class then it is called single level inheritance.
//                             for example : parent class -> child class

// 2. multi level inheritance -> when grandparent class extends parent class and parent class extends child class then it is called multi level inheritance
//                             for example : greatgrand parent class -> grand parent class -> parent class -> child class

// 3. multiple inheritance -> this is not present/supported in java because, let suppose there are 2 classes mother and father both have variable n, and mother variable n = 10 whereas father variable n = 20, therefore son get confuse(ambiguity) that which value of n should it choose from, 
//                            but just for knowledge, multilevel inheritance is when, one class is extending more than one class.
//                            Instead of using multilevel inheritance we can use interfaces, interfaces defines what a class does but not how it does, like not actual values but just concept. whereas in classes we can also assign values but not in interfaces. just like a templet
//                             for example : Mother class -|                  |--> his son class
//                                                         |-->  son class  --|
//                                           Father class -|                  |--> his daughter class

// 4. hierarchial inheritance -> one class class extends multiple classes, like one father can have multiple children, its properties are similar to single level inheritance.
//                               i am not writing the code for hierarchial inheritance because it totally similar to single level inheritance but just one class is extending many classes, nothing else. 
//                                for example : father -> first son
//                                                  |---> second son
//                                                  |---> third son        

// hybrid inheritance -> it is a combination of single level inheritance and multiple inheritance, since java dont support multiple inheritance then java dont support hybrid inheritance either.
//                        for example : |--> B --|
//                                  A --|        |--> D
//                                      |--> C --|  

// multi level inheritance here
class greatGrandParent {
    int age;
    static String surname = "Haider";

    greatGrandParent() {
        System.out.println("It is Great Grand Parent constructor");
    }

    greatGrandParent(int age) {
        this.age = age;
        System.out.println("greatGrand Parent surname : "+ greatGrandParent.surname);
    }

}

class grandParent extends greatGrandParent {
    int height;

    grandParent() {
        System.out.println("It is Grand Parent constructor");
    }
    grandParent(int age, int height) {
        super(age);
        this.height = height;
        System.out.println("Grand Parent surname : "+ grandParent.surname);
    }
}

class parent extends grandParent {
    int weight;

    parent() {
        System.out.println("It is Parent constructor");
    }
    parent(int age, int height, int weight) {
        super(age, height);
        this.weight = weight;
        System.out.println("Parent surname : "+ parent.surname);
    }
}

class child extends parent {
    String name;

    child() {
        System.out.println("It is Child constructor");
    }
    child(int age, int height, int weight, String name) {
        super(age, height, weight);
        this.name = name;
        System.out.println("Child surname : "+ child.surname);
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Surname : " + child.surname);
        System.out.println();
    }
}


public class typesOfInheritance {

    public static void main(String[] args) {

        // this part is multi level inheritance
        child firstChild = new child();
        firstChild.name = "Ayan";
        System.out.println();

        child secondChild = new child(18, 185, 63, "Ayan");
        System.out.println("Name of the second child : " + secondChild.name);
        
        System.out.println();
        secondChild.displayDetails();

        
    }
}
