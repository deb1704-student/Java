/* Array:
 * 1. Array is a collection of similar type of data.
 * 2. Array is a fixed size data structure.
 * 3. Array is a homogeneous data structure.
 * 4. Array is a contiguous memory location.
 * 5. Array is a linear data structure.
 * 6. Array is a random access data structure.

 *Operations on Array:
 * 1. Declaration
 * 2. Creation
 * 3. Initialization
 * 4. Access
 * 5. Modification
 * 6. Traversal
 * 7. Searching
 * 8. Sorting

 dataType arrayName[] = new dataType[size];  // Declaration and Creation
 int marks[] = new int[5];  // Declaration and Creation
 int numbers[] = {1, 2, 3, 4, 5};  // Declaration, Creation and Initialization
 int moreNumbers[] = new int[]{1, 2, 3, 4, 5};  // Declaration, Creation and Initialization
 String fruits[] = {"Apple", "Banana", "Mango", "Orange"};  // Declaration, Creation and Initialization
*/
import java.util.*;

public class Arr_1 {
    public static void main(String[] args) {
        // Declaration and Creation of an array
        int marks[] = new int[100];
        System.out.println(" size of the array: "+marks.length);
        Scanner sc = new Scanner(System.in);

        // Initialization of an array
        marks[0]=sc.nextInt();  //math
        marks[1]=sc.nextInt();  //chemistry
        marks[2]=sc.nextInt();  //physics

        // Accessing elements of an array
        System.out.println("Math marks: " + marks[0]);
        System.out.println("Chemistry marks: " + marks[1]);
        System.out.println("Physics marks: " + marks[2]);
        marks[0] = 100;  // Modifying the value of an element in the array
        System.out.println("Updated Math marks: " + marks[0]);
        marks[1] = marks[1]+2;  // Modifying the value of an element in the array
        System.out.println("Updated Chemistry marks: " + marks[1]);


        


        // Searching in an array

        // Sorting an array
        sc.close();
    }
}
