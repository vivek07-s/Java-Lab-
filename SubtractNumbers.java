import java.util.Scanner;
public class SubtractNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int a = sc.nextInt();

        System.out.print("enter second number :");
        int b = sc.nextInt();

        int result = a - b;

        System.out.println("sub =" + result );
        sc.close();
    }
}
