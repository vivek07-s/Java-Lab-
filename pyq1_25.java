import java.util.Scanner;
class BankAccount{
    int accountnumber;
    BankAccount(){
        System.out.println("default customer called :");
    }
    BankAccount(int accountnumber){
        this.accountnumber=accountnumber;
        System.out.println("parametrized constructor called :");
        System.out.println("account number is "+this.accountnumber);
    }
}

class SavingAccount extends BankAccount{
    double balance;

    SavingAccount(int accountnumber,double balance){
       
    
        super(accountnumber);
         this.balance=balance;
        System.out.println("saving account constructor called :");
        System.out.println("balance is "+balance);
    }
    void display(){
        System.out.println("printimg account details");
        System.out.println("account number is "+accountnumber);
        System.out.println("balance is "+balance);
    }
}

public class pyq1_25{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
            int accno;
            double bal;

            accno =sc.nextInt();
            bal=sc.nextDouble();

            SavingAccount s = new SavingAccount(accno,bal);

            s.display();
            sc.close();
    }
}