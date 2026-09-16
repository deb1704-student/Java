import java.util.ArrayList;
import java.util.Collections;
public class AL1 {

    public static void swap(ArrayList<Integer> list,int index1,int index2 ){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        //ArrayList<String> list2=new ArrayList<>();
        //ArrayList<Boolean> list3=new ArrayList<>();

        //Add Operation
        list1.add(10); //O(1)
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        //Add Operation at specific index
        list1.add(1,15); //O(n)
        System.out.println(list1);

        // Get Operation
        int element=list1.get(0); //O(1)
        System.out.println(element);

        // Remove Operation
        list1.remove(0); //O(n)
        System.out.println(list1);

        // Set Operation
        list1.set(1,100); //O(n)
        System.out.println(list1);

        // Contains Operation
        boolean ans=list1.contains(100); //O(n)
        System.out.println(ans);

        // Size Operation
        int size=list1.size(); //O(1)
        System.out.println(size);

        //Print all elements of ArrayList
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //Reverse Print all elements of ArrayList
        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //Maximum Element in ArrayList
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            max=Math.max(max,list1.get(i));
        }
        System.out.println("Maximum element: " + max);

        //Minimum Element in ArrayList
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.size();i++){
            min=Math.min(min,list1.get(i));
        }
        System.out.println("Minimum element: " + min);

        //Swapping two elements in ArrayList
        int index1=1;
        int index2=3;
        System.out.println("Before swapping: " + list1);
        swap(list1,index1,index2);
        System.out.println("After swapping: " + list1);

        // Sorting ArrayList in Ascending Order
        Collections.sort(list1); //O(n log n) Ascending Order
        System.out.println("Sorted ArrayList in Ascending Order: " + list1);
        Collections.sort(list1,Collections.reverseOrder()); //O(n log n) Descending Order
        System.out.println("Sorted ArrayList in Descending Order: " + list1);

        // Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> listA=new ArrayList<>();
        listA.add(1);
        listA.add(2);
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(3);
        listB.add(4);
        mainList.add(listA);
        mainList.add(listB);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();

            ArrayList<ArrayList<Integer>> List=new ArrayList<>();
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer> l2=new ArrayList<>();
            ArrayList<Integer> l3=new ArrayList<>();
            for(int k=1;k<=5;k++){
                l1.add(k*1);
                l2.add(k*2);
                l3.add(k*3);
            }
            List.add(l1);
            List.add(l2);
            List.add(l3);

            System.out.println("Multidimensional ArrayList:");
            for(int m=0;m<List.size();m++){
                ArrayList<Integer> currentList1=List.get(m);
                for(int n=0;n<currentList1.size();n++){
                    System.out.print(currentList1.get(n)+" ");
                }
                System.out.println();
            }

            System.out.println(List);
        }

    }
}

// ArrayList : ArrayList in Java is a resizable, dynamic array class found in the java.util package. Unlike standard Java arrays which have a fixed size, an ArrayList automatically grows or shrinks in size as elements are added or removed.
// Difference between Array and ArrayList :
// 1. Size: Arrays have a fixed size, while ArrayLists can dynamically resize.
// 2. Type: Arrays can hold both primitive types and objects, while ArrayLists can only hold objects (but can use wrapper classes for primitives).
// 3. Performance: Arrays are generally faster for fixed-size collections, while ArrayLists provide more flexibility and built-in methods for manipulation.
// 4. Methods: ArrayLists come with a variety of methods for adding, removing, and searching for elements, while arrays require manual handling of these operations.
// 5. Memory: Arrays may use less memory for small collections, while ArrayLists may have overhead due to dynamic resizing and additional features.
// 6. Iteration: Arrays can be iterated using traditional for loops, while ArrayLists can be iterated using enhanced for loops and iterators.
// 7. Null Values: Arrays can contain null values, while ArrayLists can also contain null values but may require additional handling for certain operations.
// 8. Thread Safety: Arrays are not thread-safe, while ArrayLists can be synchronized using Collections.synchronizedList() for thread safety.
// 9. Generics: ArrayLists support generics, allowing for type safety, while arrays do not have built-in support for generics.
// 10. Conversion: Arrays can be easily converted to ArrayLists using Arrays.asList(), while converting ArrayLists to arrays requires additional steps.
// 11. Performance Overhead: ArrayLists may have performance overhead due to resizing and additional features, while arrays have minimal overhead for fixed-size collections.

// Operations on ArrayList:
// 1. Adding Elements: You can add elements to an ArrayList using the add() method.
// 2. Removing Elements: You can remove elements from an ArrayList using the remove() method.
// 3. Accessing Elements: You can access elements in an ArrayList using the get() method.
// 4. Updating Elements: You can update elements in an ArrayList using the set() method.
// 5. Searching Elements: You can search for elements in an ArrayList using the contains() method.
// 6. Getting Size: You can get the size of an ArrayList using the size() method.
// 7. Clearing Elements: You can clear all elements from an ArrayList using the clear() method.


// Implementation of ArrayList using Array:
// 1. Create a class named MyArrayList.
// 2. Declare an array to hold the elements and a variable to keep track of the current size.
// 3. Implement methods for adding, removing, accessing, and updating elements.

// Multidimensional ArrayList: A multidimensional ArrayList is an ArrayList that contains other ArrayLists as its elements. It allows you to create a list of lists, enabling you to represent data in a tabular or matrix-like structure. You can create a multidimensional ArrayList by declaring an ArrayList of ArrayLists, and you can access and manipulate the elements using nested loops or specific methods.
