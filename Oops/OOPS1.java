package Oops;
public class OOPS1 {
    public static void main(String[] args) {
        PEN pen1=new PEN();     //we have created a pen object pen1 of class PEN inside the heap memory
        pen1.setColor("Blue");
        pen1.setTip(5);
        //System.out.println(pen1.color);
        System.out.println(pen1.getColor());
        //System.out.println(pen1.tip);
        System.out.println(pen1.getTip());

        Student student1=new Student();
        student1.setName("John");
        student1.setAge(20);
        student1.calPercentage(80,90,70);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.percentage);
    }

}

class PEN{
    private String color;
    private int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void setName(String newName){
        name=newName;
    }

    void setAge(int newAge){
        age=newAge;
    }

    void calPercentage(int phy , int chem , int math){
        percentage=(phy + chem + math) / 3;
    }
}

class BankAccount{
    public String username;
    private String password;

    void setUsername(String newUsername){
        username=newUsername;
    }

    void setPassword(String newPassword){
        password=newPassword;
    }
}

// Access Modifiers
// 1. Public : Accessible from anywhere
// 2. Private : Accessible only within the class
// 3. Default : Accessible only within the package
// 4. Protected : Accessible within the package and subclasses


// Getters and Setters
// GET : Methods to retrieve the values of private fields
// Getters- are used to access the private fields of a class from outside the class. They are typically public methods that return the value of a private field. The naming convention for getters is to use the prefix "get" followed by the name of the field with the first letter capitalized. For example, if you have a private field called "name", the getter method would be called "getName()".
// SET : Methods to set the values of private fields
// Setters- are used to modify the values of private fields of a class from outside the class. They are typically public methods that take a parameter and assign it to the private field. The naming convention for setters is to use the prefix "set" followed by the name of the field with the first letter capitalized. For example, if you have a private field called "name", the setter method would be called "setName(String newName)".
// this : keyword is used to refer to the current object of the class. It is used to differentiate between instance variables and local variables with the same name. For example, in the setter method "setName(String newName)", we use "this.name" to refer to the instance variable "name" of the current object, while "newName" refers to the parameter passed to the method.

// Package : A package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different folders on your computer. You might keep HTML pages in one folder, images in another, and scripts or applications in yet another. You might also keep different types of scripts (for example, client-side vs. server-side) in separate folders.
