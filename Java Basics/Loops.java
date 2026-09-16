import java.util.*;

public class Loops {
    public static void main(String[] args) {
        /*
         * int counter=0;
         * while(counter<10){
         * System.out.println("Hello");
         * counter++;
         * }
         */
        /*for (int i = 1; i < 10; i++) {
            System.out.println("Hello world");
        }*/
       /*int counter=1;
       do{
            System.out.println("Hello World");
            counter++;
       }while(counter<=10);*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println("N is prime");
        }
        else{

            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
        }

        if(isPrime == true){
            System.out.println("N is Prime");
        }
        else{
            System.out.println("N is not Prime");
        }
        sc.close();
    }
}
