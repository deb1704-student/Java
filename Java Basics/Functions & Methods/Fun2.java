import java.util.*;

public class Fun2 {
    public static int calculateSum(int num1, int num2) {// parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static int calculateSum(int num1, int num2, int num3) {// operator overloading which depends on either thr
                                                                  // name of functions or the datatypes of the
                                                                  // parameters but not on the return type of the
                                                                  // functions
        return num1 + num2 + num3;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static int Product(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binC(int n, int r) {
        int f_n = factorial(n);
        int f_r = factorial(r);
        int f_nr = factorial(n - r);
        int binC = f_n / (f_r * f_nr);
        return binC;
    }

    public static boolean isPrime(int n) {
        // corner cases
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);// arguments or actual parameters
        System.out.println(sum);

        swap(a, b);// Java Always do call by value
        System.out.println(a + " " + b);

        int pro = Product(a, b);
        System.out.println("a*b=" + pro);

        System.out.println(factorial(a));
        int t = binC(a, b);
        System.out.println(t);

        System.out.println(isPrime(a));

        sc.close();
    }

}
