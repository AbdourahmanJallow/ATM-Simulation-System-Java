package CodingISFun;
import java.util.ArrayList;
import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Bank_Account> bankAccounts = new ArrayList<>();

        System.out.println("****** WELCOME TO FIB BANK Ltd *******");
        System.out.println("--------------------------------------");
        boolean notDone = true;

        while (notDone){
            System.out.println("\n***** What operation do you want? *****");
            System.out.println("1.Register  \n2.Deposit  \n3.Withdraw  \n4.Check Balance  \n0.Exit- ");
            int number = in.nextInt();


            if (number == 1){
                System.out.println("Enter first name: ");
                String name = in.next();
                System.out.println("Account Number: ");
                String accountNumber = in.next();
                System.out.println("Enter balance: ");
                double balance = in.nextDouble();

                bankAccounts.add(new Bank_Account(name,accountNumber,balance).registerCustomer());
            }
            else if (number == 2){
                // deposit to account
                System.out.println("Enter account number: ");
                String accountNo = in.next();
                for (int i = 0;i < bankAccounts.size();i++){
                    if (bankAccounts.get(i).searchAccount(accountNo)){
                        System.out.print("How much would you like to deposit? ");
                        double amount = in.nextDouble();
                        bankAccounts.get(i).deposit(amount);
                        break;
                    }
                }
                System.out.println("Thank you for using FIB Bank!");
            }
            else if (number == 3){
                // withdraw from account
                System.out.println("Enter account number: ");
                String num = in.next();
                for (int i = 0;i < bankAccounts.size();i++) {
                    if (bankAccounts.get(i).searchAccount(num)) {
                        System.out.print("How much would you like to Withdraw? ");
                        double amount = in.nextDouble();
                        bankAccounts.get(i).withdraw(amount);
                        break;
                    }

                }
                System.out.println("Thank you for using FIB Bank!");
            }
            else if (number == 4){
                // check remaining balance
                System.out.println("Enter account number: ");
                String num = in.next();
                for (Bank_Account account : bankAccounts){
                    if (account.searchAccount(num)){
                        System.out.println("Account Holder: " + account.getName());
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Balance: D" + account.getBalance());
                        break;
                    }
                }
                System.out.println("Thank you for using FIB Bank!");
            }
            else if (number == 0){
                // Quit
                notDone = false;
                System.out.println("Thank you for using FIB Bank!");
            }
        }
    }
}
