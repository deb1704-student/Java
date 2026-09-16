import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

class Shapes{
    double area;
    void computeArea(){}
}
class Circle extends Shapes{
    double radius;
    Circle(double r){
        radius = r;
    }
    void computeArea(){
        area = Math.PI*radius*radius;
    }

    public String toString(){
        return String.format("Circle(%.2f)", radius);
    }

}
class Rectangle extends Shapes{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length = l;
        breadth = b;
    }
    void computeArea(){
        area = length*breadth;
    }
    public String toString(){
        return String.format("Rectangle(%.2f, %.2f)", length, breadth);
    }
}
class Triangle extends Shapes{
    double base;
    double height;
    Triangle(double b,double h){
        base = b;
        height = h;
    }
    void computeArea(){
        area = 0.5*base*height;
    }
    public String toString(){
        return String.format("Triangle(%.2f, %.2f)", base, height);
    }
}
public class Sheets {

    static Shapes createShape(int type, Scanner sin){
        Shapes obj;
        switch(type){
            case 1:
                System.out.print("Enter radius: ");
                obj = new Circle(sin.nextDouble());
                obj.computeArea();
                break;
            case 2:
                System.out.print("Enter length and breadth: ");
                obj = new Rectangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            case 3:
                System.out.print("Enter base and height: ");
                obj = new Triangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            default:
                obj = null;
                break;
        }
        return obj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=0, sheetType;
        Shapes[] arr = new Shapes[50];
        Shapes s;
        while(sc.hasNextInt()){
            sheetType = sc.nextInt();
            if(sheetType == 0) break;
            s = createShape(sheetType, sc);
            if(s != null){
                arr[i++] = s;
            }
        }
        n=i;
        Arrays.sort(arr ,0 , n, new Comparator<Shapes>(){
            public int compare(Shapes s1, Shapes s2){
                if(s1.area > s2.area) return 1;
                else if(s1.area < s2.area) return -1;
                else return 0;
            }
        });

        for(int j=0; j<n; j++){
            System.out.printf("%d: %s Area: %.2f\n", j+1, arr[j], arr[j].area);
        }

    }
}
