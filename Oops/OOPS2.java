package Oops;

public class OOPS2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        System.out.println(student1.name);
        System.out.println(student1.age);
        student1.address = "456 Elm St";
        System.out.println(student1.address);
        student1.marks = new int[]{90, 80, 70};

        Student student2 = new Student(student1);
        student2.address = "123 Main St";
        System.out.println(student2.name);
        System.out.println(student2.address);
        //student1.marks[0] = 100; // changing the marks of student1 will also change the marks of student2 because they are pointing to the same array in memory
        //System.out.println(student2.marks[0]); // this will print 100 because student2.marks is pointing to the same array as student1.marks

        student2.marks[0] = 100; // changing the marks of student2 will not change the marks of student1 because they are pointing to different arrays in memory
        System.out.println(student1.marks[0]); // this will print 90 because student1.marks is pointing to a different array than student2.marks
    }

}

class Student {
    public String name;
    public int age;
    String address;
    int marks[];

    Student(String name, int age) {
        System.out.println("Constructor called");

        this.name = name;
        this.age = age;
    }
    Student(String name) {
        System.out.println("Constructor called");
        this.name = name;
    }
    //shallow copy constructor
    /*Student(Student s1) {
        System.out.println("Copy Constructor called");
        marks=new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;  // this doesn't create a new array, it just copies the reference of the array from s1 to this object. So if we change the marks in one object, it will affect the other object as well.
    }*/

    //deep copy constructor
    Student(Student s1) {
        System.out.println("Copy Constructor called");
        marks=new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0;i<s1.marks.length;i++){
            this.marks[i]=s1.marks[i];  // this creates a new array and copies the values from s1.marks to this.marks. So if we change the marks in one object, it will not affect the other object.
        }
    }

}

// Encapsulation: Wrapping up of data and methods into a single unit is called
// encapsulation. It is the mechanism that binds together code and the data it
// manipulates, and keeps both safe from outside interference and misuse. Data
// encapsulation led to the important OOP concept of data hiding.

// Constructor: A constructor is a special method that is used to initialize
// objects. The constructor is called when an object of a class is created. It
// can be used to set initial values for object attributes. A constructor has
// the same name as the class and does not have a return type. There are two
// types of constructors in Java: default constructor and parameterized
// constructor.

// Types of Constructors:
// 1. Default Constructor: A default constructor is a constructor that takes no
// arguments. It is automatically provided by the compiler if no constructors
// are explicitly defined in the class. The default constructor initializes the
// object with default values. For example, if a class has a default
// constructor,it will initialize the object's attributes to their default
// values (e.g. 0 for numeric types, null for object references, etc.). If a class has a
// default constructor, it can be used to create objects without providing any initial
// values. For example, if a class has a default constructor, it can be used to
// create objects without providing any initial values.

// 2. Parameterized Constructor: A parameterized constructor is a constructor
// that takes arguments. It is used to initialize the object with specific
// values provided by the user. The parameterized constructor allows the user to
// set initial values for the object's attributes at the time of object creation.
// For example, if a class has a parameterized constructor, it can be used to create
// objects with specific initial values.

// Copy Constructor: A copy constructor is a constructor that creates a new
// object as a copy of an existing object. It takes an object of the same class
// as an argument and initializes the new object with the values of the existing
// object. The copy constructor is used to create a new object that is a copy of
// an existing object. It is useful when you want to create a new object that has
// the same state as an existing object. The copy constructor is called when a
// new object is created from an existing object, as a copy of the existing
// object. The copy constructor is also used when an object is passed by value
// to a method or returned from a method. In Java, the copy constructor is not
// provided by default, but it can be implemented by the user. The copy
// constructor is typically defined with the same name as the class and takes a
// single argument of the same class type. For example, if a class has a copy
// constructor, it can be used to create a new object that is a copy of an
// existing object.

//Constructor Overloading: Constructor overloading is a concept in object-oriented programming where a class can have multiple constructors with the same name but different parameter lists. This allows for the creation of objects with different initializations based on the provided arguments. Each constructor can perform different tasks or initialize the object in different ways, depending on the parameters passed during object creation. Constructor overloading enhances flexibility and usability by allowing developers to create objects in various ways, catering to different scenarios and requirements.

// Shallow Copy: A shallow copy is a bit-wise copy of an object. The copied object created has an exact copy of the values in the original object. If any of the fields of the object are references to other objects, just the reference addresses are copied i.e., the references point to the same object in memory. Therefore, if we change the value of a field in one object, it will also change the value of that field in the other object because they both point to the same memory location. In Java, shallow copies can be created using the clone() method or by simply assigning one object to another.
// Deep Copy: A deep copy is a process in which a new object is created and the values of the original object are copied to the new object. In a deep copy, if any of the fields of the object are references to other objects, new copies of those objects are created as well. This means that the new object and the original object do not share any references to the same objects in memory. Therefore, if we change the value of a field in one object, it will not affect the other object because they are completely independent of each other. In Java, deep copies can be created by implementing the Cloneable interface and overriding the clone() method to create new instances of referenced objects.

// Garbage Collection: Garbage collection is the process of automatically freeing up memory by removing objects that are no longer in use or reachable by the program. In Java, the garbage collector is responsible for identifying and reclaiming memory occupied by objects that are no longer needed. The garbage collector runs in the background and periodically checks for objects that are no longer referenced by any part of the program. When it finds such objects, it frees up the memory they occupy, making it available for future object allocations. This helps prevent memory leaks and ensures efficient memory management in Java applications.
// Destructor: A destructor is a special method that is called when an object is destroyed or deallocated. In Java, there are no explicit destructors like in some other programming languages. Instead, Java relies on garbage collection to automatically manage memory and clean up objects that are no longer in use. When an object is no longer reachable, the garbage collector will eventually reclaim its memory, and any resources associated with that object will be released. However, if you need to perform cleanup tasks before an object is destroyed, you can implement the finalize() method in your class. The finalize() method is called by the garbage collector before the object is removed from memory, allowing you to release any resources or perform any necessary cleanup operations.
