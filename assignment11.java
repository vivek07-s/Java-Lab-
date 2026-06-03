import java.util.Scanner;
abstract class Shape{
    abstract void rectanglearea(double length,double breadth);
    abstract void squarearea(double side);
    abstract void circle(double radius);
}
 class Area extends Shape{
    void rectanglearea(double length,double breadth){
        double area=length*breadth;
        System.out.println("area is "+area);
    }

    void squarearea(double side){
        double area=side*side;
        System.out.println("area is "+area);

    }
    void circle(double radius){
        double area=3.14*radius*radius;
        System.out.println("area is :"+area);
        }
}
public class assignment11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape s = new Area();
        System.out.println("enter the length of rectangle :");
        double l=sc.nextDouble();
         System.out.println("breadth of rectangle is :");
         double b=sc.nextDouble();
         s.rectanglearea(l, b);
          System.out.println("enter side of square:");
          double sde=sc.nextDouble();
          s.squarearea(sde);
           System.out.println("enter radius of circle:");
           double rde=sc.nextDouble();
           s.circle(rde);
sc.close();
    }
}
