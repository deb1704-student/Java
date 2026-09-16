import java.util.*;

public class Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Sum=" + (A + B));
        System.out.println("Difference=" + (A - B));
        System.out.println("Multiply=" + (A * B));
        System.out.println("Quotient=" + (A / B));
        System.out.println("Remainder=" + (A % B));
        System.out.println("Unary=" + (A++ + B-- + ++A + --B));
        System.out.println((A > B));
        System.out.println((A < B));
        System.out.println((A >= B));
        System.out.println((A <= B));
        System.out.println((A == B));
        System.out.println((A != B));
        System.out.println((A<=B)&&(3<0));
        System.out.println(!(A<=B));
        System.out.println((A<=B)||(3>0));
        A+=10;
        System.out.println(A);
        A-=5;
        System.out.println(A);
        A*=8;
        System.out.println(A);
        A/=10;
        System.out.println(A);
        A%=7;
        System.out.println(A);
        sc.close();

    }

}
