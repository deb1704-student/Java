package Oops;

public class OOPS4 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.walk();
        System.out.println("Horse color: "+horse.color);
        horse.changeColor();
        System.out.println("Horse color: "+horse.color);

        Chicken chicken=new Chicken();
        chicken.eat();
        chicken.walk();

        Mustang mustang=new Mustang();
        mustang.eat();
        mustang.walk();

        Queen queen=new Queen();
        queen.move();

        Student student1=new Student();
        student1.setName("John");
        student1.setRoll(1);
        System.out.println("Student Name: "+student1.getName());
        System.out.println("Student Roll: "+student1.getRoll());
        System.out.println("Student School: "+Student.schoolName);
        student1.schoolName="ABC School";
        System.out.println("Student School: "+student1.schoolName);
        Student student2=new Student();
        student2.schoolName="XYZ School";
        System.out.println("Student School: "+student2.schoolName);
        System.out.println("Student School: "+student1.schoolName);

    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor called");
        color="Brown";
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk(); // abstract method
}

class Horse extends Animal{
    Horse(){
        super(); // calling parent class constructor
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Chicken is walking");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Queen can move in any direction");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("Rook can move in straight lines");
    }
}

class Bishop implements ChessPlayer{
    public void move(){
        System.out.println("Bishop can move diagonally");
    }
}

class Knight implements ChessPlayer{
    public void move(){
        System.out.println("Knight can move in L shape");
    }
}

class Pawn implements ChessPlayer{
    public void move(){
        System.out.println("Pawn can move forward only");
    }
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("King can move one square in any direction");
    }
}

class Student{
    String name;
    int roll;

    static String schoolName; // static variable

    void setName(String name){
        this.name=name;
    }

    void setRoll(int roll){
        this.roll=roll;
    }

    String getName(){
        return this.name;
    }

    String getRoll(){
        return String.valueOf(this.roll);
    }
}



// Abstraction : It is a process of hiding the implementation details and showing only functionality to the user. In Java, abstraction is achieved using abstract classes and interfaces. It allows us to focus on what the object does instead of how it does it.
// Abstract Class : It is a class that cannot be instantiated and is declared using the abstract keyword. It can have abstract methods (methods without a body) as well as concrete methods (methods with a body). An abstract class can have constructors, member variables, and methods. It is used to provide a base for subclasses to extend and implement the abstract methods.
// Abstract Method : It is a method that is declared without an implementation. It is declared using the abstract keyword and does not have a body. An abstract method must be implemented by the subclasses of the abstract class.
// In the above code, we have an abstract class Animal with an abstract method walk(). The Horse and Chicken classes extend the Animal class and provide their own implementation of the walk() method. The Mustang class extends the Horse class and inherits its properties and methods.

// Interface : An interface in Java is a reference type that is similar to a class and is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface. Interfaces are used to achieve abstraction and multiple inheritance in Java. An interface can have default methods, static methods, and constants.
// Difference between Abstract Class and Interface:
// 1. Abstract Class can have both abstract and concrete methods, while Interface can only have abstract methods (until Java 8, after which it can have default and static methods).
// 2. Abstract Class can have member variables, while Interface can only have constants (public static final variables).
// 3. A class can extend only one abstract class, but it can implement multiple interfaces.
// 4. Abstract Class can have constructors, while Interface cannot have constructors.
// 5. Abstract Class is used when classes share a common base and behavior, while Interface is used to define a contract that multiple classes can implement.
// 6. Abstract Class can have access modifiers for its members, while Interface members are implicitly public and abstract (except for default and static methods).
// 7. Abstract Class can have instance methods, while Interface cannot have instance methods (except for default methods).
// 8. Abstract Class can have final methods, while Interface cannot have final methods (except for default methods).
// 9. Abstract Class can have static methods, while Interface can have static methods (since Java 8).
// 10. Abstract Class can have inner classes, while Interface can have inner interfaces and static nested classes.
// 11. Abstract Class can have abstract methods with different access modifiers, while Interface methods are implicitly public and abstract (except for default and static methods).
// 12. Abstract Class can have abstract methods with different return types, while Interface methods must have the same return type (except for default and static methods).
// 13. Abstract Class can have abstract methods with different parameter types, while Interface methods must have the same parameter types (except for default and static methods).
// 14. Abstract Class can have abstract methods with different exception types, while Interface methods must have the same exception types (except for default and static methods).
// 15. Abstract Class can have abstract methods with different access modifiers, return types, parameter types, and exception types, while Interface methods must have the same access modifiers, return types, parameter types, and exception types (except for default and static methods).

// Static : The static keyword in Java is used for memory management primarily. It can be applied to variables, methods, blocks, and nested classes. When a member is declared as static, it belongs to the class rather than any instance of the class. This means that there is only one copy of the static member shared among all instances of the class. Static members can be accessed directly using the class name without creating an instance of the class. Static methods cannot access instance variables or methods directly; they can only access other static members. Static blocks are used for static initialization of a class, and they are executed when the class is loaded into memory.

// Super: The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. It can be used to access parent class methods, constructors, and variables. The super keyword is commonly used in method overriding to call the parent class method from the child class. It can also be used to invoke the parent class constructor from the child class constructor. When a subclass constructor is called, it implicitly calls the superclass constructor using super(), unless explicitly specified otherwise. The super keyword helps in achieving code reusability and maintaining a clear hierarchy in object-oriented programming.
