import java.util.*;
public class Matrices {
    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at: " + i + ", " + j);
                    return ;
                }
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3]; // Declaration and Creation of a 2D array
        System.out.println("Enter the elements of the matrix:");
        // Initialization of a 2D array
        int n=matrix.length; // number of rows
        int m=matrix[0].length; // number of columns
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // Accessing elements of a 2D array
        System.out.println("Elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // Searching in a 2D array
        System.out.println("Enter the element to search:");
        int key=sc.nextInt();
        search(matrix,key);

        sc.close();
    }

}
/*
 * 2D Arrays
 * Matrices are 2D arrays, which are used to store data in a tabular form. They
 * are represented as a collection of rows and columns. Each element in a matrix
 * can be accessed using two indices: one for the row and one for the column.
 * In Java, a 2D array can be declared and initialized as follows:
 * dataType[][] arrayName = new dataType[rows][columns]; // Declaration and Creation
 * int matrix[][] = new int[3][3]; // Declaration and Creation
 * int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Declaration, Creation and Initialization
 */
