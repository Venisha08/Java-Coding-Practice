// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class BankAccount 
    {
        String name;
        int accountNumber;
        int deposite;
        int withdraw;
        
        BankAccount(String name, int accountNumber,int deposite,int withdraw)
        {
            this.name = name;
            this.accountNumber = accountNumber;
            this.deposite = deposite;
            this.withdraw = withdraw;
            
        }
        public int deposite(int deposite)
        {
            System.out.println("deposite:");
            return deposite;
        }
        public int withdraw(int withdraw)
        {
            System.out.println("withdraw:");
            return withdraw;
        }
         public void checkbalance()
        {
            int balance = deposite - withdraw;
            System.out.println("Available balance:"+ balance);
        
        }
        
    }
class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Bank Details ");
        System.out.println("Enter Account Holdername :");
        String name = sc.next();
        System.out.println("Enter Account Number :");
        int accountNumber = sc.nextInt();
        
        System.out.println("Enter deposite amount :");
        int deposite = sc.nextInt();
        System.out.println("Enter withdraw amount :");
        int withdraw = sc.nextInt();
      

    BankAccount ba = new BankAccount(name,accountNumber,deposite,withdraw);
        ba.deposite(deposite);
        ba.withdraw(withdraw);
        ba.checkbalance();
        
        
            }
}