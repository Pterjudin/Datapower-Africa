/*
 * Account Types ---> Savings or Current
 * User should have ----> Account Number, Account Name, Balance, Account Types
 * User should be able to ----> checkBalance, deposit, withdraw
 */

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountName;
    double balance;
    String accountType; 

    public BankAccount(int customerAccountNumber, 
                       String customerName, 
                       double customerBalance, 
                       String customerAccountType){
                        
            accountNumber = customerAccountNumber;
            accountName = customerName;
            balance = customerBalance;
            accountType = customerAccountType;
}
    public void checkBalance(){
        System.out.println("Your balance is "+ balance);
    }

    public void deposit(double depositeAmount){
        balance += depositeAmount;
        System.out.println("Your balance after deposit is "+ balance);
    }

    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        System.out.println("Your balance after deposit is "+ balance);
    }



    public static void main(String[] args) throws Exception {
        BankAccount Timmy = new BankAccount(0011223344, 
                                                    "Timmy Olamide", 
                                                    100000, 
                                                    "Savings");
        
    Timmy.checkBalance();
    // Expect 100000
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the deposit amount: ");  
    double deposit = input.nextDouble();
    
    Timmy.deposit(deposit);   
    // Close input
    input.close();
    }
}
