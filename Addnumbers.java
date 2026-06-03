import java.util.Scanner;// scanner class ko import kia h jisse hum input le sakay 

public class Addnumbers {// ye hamari class h 

    public static void main(String[] args){// program starting like it is main in c lang 

        Scanner sc = new Scanner(System.in);

        System.out.print(" enter first numbers :");

        int a = sc.nextInt();

        System.out.println("enter second number :");

        int b = sc.nextInt();

        int sum = a + b ;
         System.out.println("sum = " + sum);
         sc.close();
    }
}