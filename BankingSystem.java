package CodingISFun;

import java.util.Scanner;

public class BankingSystem {
    private String name;
    private String accountNo;
    private double balance;
    private Scanner in = new Scanner(System.in);

    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }
    private void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        this.balance = balance;
    }


// Method showing account details.
    public void showAccountInfo(){
        System.out.println("\n**** ACCOUNT DETAILS ****");
           System.out.println("Account No: " + this.getAccountNo());
           System.out.println("Account owner: " + this.getName());
           System.out.println("Balance: D" + this.getBalance());
    }

// deposit method.
    public void deposit(){
        System.out.print("\nEnter amount you want to deposit: ");
        double amount = in.nextDouble();
        balance += amount;
    }

// withdraw method
    public void withdraw(){
        System.out.print("\nEnter amount you want to withdraw: ");
        double amount = in.nextDouble();
            if (amount > balance) {
                System.out.println("Transactions Failed...Insufficient balance...");
            }
            else balance -= amount;
}

// method to register a new customer,
// returns a new banking system object whenever its called
    public void registerNewCustomer(){
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNo = in.next();
        System.out.println("Enter balance: ");
        double balance = in.nextDouble();
        setName(name);
        setAccountNo(accountNo);
        setBalance(balance);
    }
    public boolean search(String accNo){
        if (accountNo.equals(accNo)){
            showAccountInfo();
            return true;
        }
        return false;
    }
}

