package CodingISFun;

public class Bank_Account{
//  instance variables
    private String name;
    private String accountNumber;
    private double balance;
    private String address;

    public Bank_Account(String name,String accountNumber,double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Error......You don't have enough balance....");
        }
        else balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean searchAccount(String accNo){

        return accountNumber.equals(accNo);
    }
    public Bank_Account registerCustomer(){
         return new Bank_Account(name,accountNumber,balance);
    }
}