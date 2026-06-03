import java.util.Scanner;

public class assignment1 {

    static void add(double a , double b){
        double sum = a + b ;
        System.out.println("sum is "+ sum );
    }

    static void multiply(double a , double b){
        double pro = a * b ;
        System.out.println("multiply is "+ pro );
    }

    static void sub(double a , double b){
        double minus = a - b ;
        System.out.println("minus is "+ minus );
    }

    static void divide(double a , double b){
        double div = a / b ;
        System.out.println("divide is "+ div );
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("enter first number :");
            double a = sc.nextDouble();

            System.out.println("enter second number :");
            double b = sc.nextDouble();

            while(true){

                System.out.println("press 1 for addition :");
                System.out.println("press 2 for multiplication :");
                System.out.println("press 3 for subtraction :");
                System.out.println("Press 4 for division :");
                System.out.println("press 5 for exit :");

                System.out.println("enter your choice :");
                int choice = sc.nextInt();

                if(choice < 1 || choice > 5){
                    throw new Exception("Invalid choice entered");
                }

                switch(choice){

                    case 1 : add(a, b);
                    break;

                    case 2 : multiply(a, b);
                    break;

                    case 3 : sub(a, b);
                    break;

                    case 4 : divide(a, b);
                    break;

                    case 5 : System.exit(0);
                    break;
                }
                sc.close();
            }

        }

        catch(Exception e){
            System.out.println("Error: Invalid numeric input.");
        }
        
    }
}