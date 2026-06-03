import java.util.Scanner;
class bankaccount{
    private String accno;
    private String accholdername;
    private double balance;

    bankaccount(String accno, String accholdername,double balance){
        this.accno=accno;
        this.accholdername=accholdername;
        this.balance=balance;
    }

    public String getaccno(){
        return accno;
    }
    public String getaccholdername(){
        return accholdername;
    }
    public double getbalance(){
        return balance;
    }

    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("amount deposited :"+balance);
    }

    public boolean withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("amount withdrawed "+ amount);
            return true;
        }
        else{
            System.out.println("insufficiant balance ");
            return false;
        }
    }
    void displayaccountinfo(){
        System.out.println("account ni=o is :"+accno,"acchount holder name is :"+accholdername,"balance is :"+balance);
    }
}

public class assignment10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter account  number :");
            String accno=sc.nextLine();
            System.out.println("enter account holder name :");
            String accholdername=sc.nextLine();
            System.out.println("enter balance of the account");
            float balance=sc.nextFloat();
            bankaccount b1=bankaccount(accno,accholdername,balance);
            System.out.println("enter the amount to be deposited:");
            float amt=sc.nextFloat();
            b1.deposit(amt);
            System.out.println("enter the amount to be withdrawn :");
            float wtd=sc.nextFloat();
            b1.withdraw(wtd);
            System.out.println("account details:");
            b1.displayaccountinfo();
            sc.close();


        }
    }

