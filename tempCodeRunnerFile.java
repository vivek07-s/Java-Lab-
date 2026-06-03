import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int sum1=0,sum2=0;
        num1=sc.nextInt();
        num2=sc.nextInt();

        for (int i=1;i<num1;i++){
            if(num1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum2+=i;
            }
        }
        if((float)sum1/num1==(float)sum2/num2){
            System.out.println("number is friendlly pair ");
        }
        else 
            System.out.println("number is not friendly pair ");
    sc.close();
    }    
   
}
