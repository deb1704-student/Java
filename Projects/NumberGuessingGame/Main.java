import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //Creating Game Object
        Game game=new Game(scanner);
        game.start();
        scanner.close();
    }
}
