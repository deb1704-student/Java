import java.util.*;

public class BitWise {

    public static void od(int a) {
        int bitwise = 1;
        if ((a & bitwise) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a & b));
        System.out.println((a | b));
        System.out.println((a ^ b));
        System.out.println((~0));
        System.out.println((a << b)); // a * 2^b
        System.out.println((a >> b)); // a / 2^b

        od(a); // Check for odd or even

        System.out.println(getIthBit(a,3));     // Get I-th Bit

        System.out.println();

        sc.close();
    }

}
/*
 * Bit-wise Operator
 * Binary AND &
 * Binary OR |
 * Binary XOR ^
 * Binary One's Complement ~
 * Binary Left Shift <<
 * Binary Right Shift >>
 */
