public class BinDec {
    public static void binToDec(int n) {
        int ans = 0;
        int power = 0;
        while (n > 0) {
            int lD = n % 10;
            ans += lD * (int) Math.pow(2, power);
            power++;
            n /= 10;
        }
        System.out.println("Decimal of " + n + " is " + ans);
    }

    public static void decToBin(int n) {
        int originalN = n; // Store the original value of n for printing
        int ans = 0;
        int power = 0;
        while (n > 0) {
            int rem = n % 2;
            ans += rem * (int) Math.pow(10, power);
            power++;
            n /= 2;
        }
        System.out.println("Binary of " + originalN + " is " + ans);
    }

    public static void main(String[] args) {
        binToDec(111); // Output: 7
        decToBin(7); // Output: 111
    }
}

/*
 * Scope of variables: The scope of a variable is the region of the program
 * where the variable is defined and can be accessed. In Java, variables can
 * have different scopes, such as local scope (within a method), class scope
 * (within a class), and global scope (accessible throughout the program).
 * Understanding variable scope is important for managing data and avoiding
 * naming conflicts.
 *
 * Two types of Scope:      1. Local Scope: Variables declared within a method or
 * block have local scope. They can only be accessed within that method or
 * block. Once the method or block is exited, the variable is no longer
 * accessible.
 * 2. Global Scope: Variables declared outside of any method or
 * block have global scope. They can be accessed from any part of the program,
 * including methods and blocks. Global variables are typically declared at the
 * class level and can be used throughout the program.
 * Method Scope: Variables declared within a method have method scope. They can only be accessed within that method. Once the method is exited, the variable is no longer accessible.
 * Block Scope: Variables declared within a block (e.g., within curly braces {}) have block scope. They can only be accessed within that block. Once the block is exited, the variable is no longer accessible.
 * Class Scope: Variables declared at the class level (outside of any method) have class scope. They can be accessed by any method within the class. Class variables are typically declared as static or instance variables.
 */
