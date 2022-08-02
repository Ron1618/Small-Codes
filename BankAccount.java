import java.util.Scanner;
public class BankAccount{
   public String AccountNumber;
   private double Balance;
   public double Deposit;
   public double Withdraw;
   private String Type;



   public String getAccountNumber(){
      return AccountNumber;
   }
   public double getBalance(){
      return Balance - Withdraw + Deposit;
   }
   public String getType(){
      return Type;
   }

   


   public void setAccountNumber(String x){
      AccountNumber = x;
   }
   public void setBalance(double x){
      Balance = x;
   }
   public void setType(String x){
      Type = x;
   }
   public void deposit(double x){
      Deposit = x;
   }
   public void withdraw(double x){
      Withdraw = x;
   }
   public static void main(String[] aaa){
      BankAccount bb = new BankAccount();
      BankAccount r1 = new BankAccount();
      BankAccount r2 = new BankAccount();
      
      Scanner sc = new Scanner (System.in);

      System.out.print("enter the type of the account: ");
      bb.setType(sc.nextLine());
      
      System.out.print("enter the number of the account: ");
      bb.setAccountNumber(sc.nextLine());

      System.out.print("enter the balance of the account: ");
      bb.setBalance(sc.nextDouble());


      System.out.print("enter an amount to be added to the account: ");
      double a1 = sc.nextDouble();
      
      System.out.print("enter an amount to be added to the account: ");
      double a2 = sc.nextDouble();

      System.out.print("enter an amount to be withdrawn from the account: ");
      double a3 = sc.nextDouble();
      
      System.out.print("enter an amount to be withdrawn from the account: ");
      double a4 = sc.nextDouble();

      System.out.println("account " + bb.getAccountNumber());

      System.out.println("type " + bb.getType());

      double cd = bb.getBalance() + a1 + a2 - a3 -a4;

      System.out.println("balance " + cd);
   }
}