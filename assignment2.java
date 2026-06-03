import java.util.Scanner;
public class assignment2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int num1,num2;
        
        System.out.println("enter first number :");
        num1= sc.nextInt();
        System.out.println("enter second number :");
        num2= sc.nextInt();
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum1=sum1+i;
            }
        }
        for(int j=1;j<num2;j++){
            if(num2%j==0){
                sum2=sum2+j;
            }
        }
        if((sum1/num1)==(sum2/num2)){
            System.out.println("same");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
}
