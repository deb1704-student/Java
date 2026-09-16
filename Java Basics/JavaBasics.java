import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        /*
         * System.out.print("Hello World\nHello World\n");
         * System.out.println("Hello World");
         * System.out.println("Hello World");
         * int a=10 ,b =20;
         * System.out.println(a);
         * System.out.println(b);
         * System.out.println(a+""+b);
         * String name="Tony Stark";
         * System.out.println(name);
         * a=b;
         * System.out.println(a);
         */
        Scanner sc = new Scanner(System.in);
        /*
         * String input = sc.next();
         * System.out.println(input);
         *
         * String name = sc.nextLine();
         * System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);
        float num = sc.nextFloat();
        System.out.println(num);*/
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a*b);
        float r=sc.nextFloat();
        System.out.println(3.14*r*r);
        sc.close();

    }
}
