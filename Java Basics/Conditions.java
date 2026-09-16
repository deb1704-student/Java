import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int age = sc.nextInt();
         *
         * if (age >= 18) {
         * System.out.println("Adult");
         * } else if (age >= 13 && age < 18) {
         * System.out.println("Teenager");
         * } else {
         * System.out.println("Child");
         * }
         */
        /*
         * int num = sc.nextInt();
         * String type=((num%2)==0)?"even":"odd";
         * System.out.println(type);
         */
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong Operator");

        }
        sc.close();
    }
}
