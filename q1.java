/*public class q1 {
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("java calculator :");
            return;

        }
    try{
     Double num1 = Double.parseDouble(args[0]);
     Double num2 = Double.parseDouble(args[2]);
     String op = args[1];
     double result =0;
     switch (op) {
        case "+":result=num1+num2;break;
        case "-":result=num1-num2;break;
        case"*":result=num1*num2;break;
        case"/":result=num1/num2;break;
        default:System.out.println("default: operator is invalid");
            return;
     }
      System.out.println("Output: " + result);
    }
catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
    }
}


}
*/
class Calculator {
    public static void main(String args[]) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        try {
            // Wrapper Classes + Autoboxing
            Double num1 = Double.parseDouble(args[0]);
            Double num2 = Double.parseDouble(args[2]);

            char op = args[1].charAt(0);

            Double result = 0.0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }

            System.out.println("Output: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }
}