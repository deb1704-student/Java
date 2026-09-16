package Oops;

public class OOPS3 {
    public static void main(String[] args) {
        Fish Shark=new Fish();
        Shark.eat();
        Shark.breathe();
        Shark.swim();

        Dog Bruno=new Dog();
        Bruno.eat();
        Bruno.legs=4;
        System.out.println("Bruno has "+Bruno.legs+" legs");

        Calculator calc=new Calculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5,10,15));
        System.out.println(calc.add(5.5,10.5));

        Deer deer=new Deer();
        deer.eat();

    }
}

//Inheritance : It is a mechanism in which one class acquires the property of another class. With the use of inheritance the information is made manageable in a hierarchical order. Inheritance represents the IS-A relationship.
class Animal{
    String color;
    void eat(){
        System.out.println("Animal is eating");
    }
    void breathe(){
        System.out.println("Animal is breathing");
    }
}
// Derived class

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammal is walking");
    }
}
class Dog extends Mammal{
    String breed;
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish is swimming");
    }
}

// Method Overloading : It is a feature that allows a class to have more than one method having the same name, if their parameter lists are different. It is related to compile-time (or static) polymorphism.
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}

//Method Overriding : It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating");
    }
}


// Level 1 Inheritance : When a class inherits another class, it is known as single inheritance. In this type of inheritance, the child class acquires the properties and behaviors of the parent class. It is also known as single-level inheritance.
// Level 2 Inheritance : When a class inherits another class, which in turn inherits another class, it is known as multilevel inheritance. In this type of inheritance, the child class acquires the properties and behaviors of the parent class, and the parent class acquires the properties and behaviors of its parent class. It is also known as multi-level inheritance.
// Hierarchical Inheritance : When multiple classes inherit from a single class, it is known as hierarchical inheritance. In this type of inheritance, the child classes acquire the properties and behaviors of the parent class. It is also known as multiple inheritance.
// Hybrid Inheritance : When a combination of two or more types of inheritance is used, it is known as hybrid inheritance. In this type of inheritance, the child classes acquire the properties and behaviors of the parent class, and the parent class acquires the properties and behaviors of its parent class. It is also known as multiple inheritance.
// Note: Java does not support multiple inheritance through classes to avoid ambiguity. However, it can be achieved through interfaces.

//Polymorphism : It is the ability of an object to take on many forms. The most common use of polymorphism in OOP is when a parent class reference is used to refer to a child class object. There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. Compile-time polymorphism is achieved by method overloading, and runtime polymorphism is achieved by method overriding.
// Compile-time Polymorphism : It is also known as static polymorphism. It is achieved by method overloading. In method overloading, multiple methods have the same name but different parameters. The method to be called is determined at compile time based on the number and type of arguments passed to the method.
// Runtime Polymorphism : It is also known as dynamic polymorphism. It is achieved by method overriding. In method overriding, a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime based on the object being referred to by the reference variable.
