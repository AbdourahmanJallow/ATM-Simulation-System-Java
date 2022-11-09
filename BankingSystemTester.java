package CodingISFun;

import java.util.Scanner;

public class BankingSystemTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of accounts you want to register: ");
        int count = in.nextInt();
        BankingSystem[] bankingSystem = new BankingSystem[count];


        boolean done = true;
        System.out.println("|************ Welcome to ABC Bank. *************|");
        System.out.println("|-----------------------------------------------|");
        while (done){
                System.out.println("\n|********* What operation do you want? *********|");
                System.out.println("1.Register \n2.Deposit \n3.Withdraw. \n4.Check Balance \n5.Exit");
                int var = in.nextInt();

                // Registration
                if (var == 1){
                    for (int i = 0;i < bankingSystem.length;i++) {
                        bankingSystem[i] = new BankingSystem();
                        bankingSystem[i].registerNewCustomer();
                    }
                    }

                // deposit
                else if (var == 2){
                    System.out.print("Enter Account no: ");
                    String accNo = in.next();
                    for (int i = 0;i < 3;i++) {
                        if (bankingSystem[i].search(accNo)) {
                            bankingSystem[i].deposit();
                            break;
                        }
                    }
                }

                // Withdrawal
                else if (var == 3){
                    System.out.print("Enter Account no: ");
                    String ac_no = in.next();
                    for (BankingSystem system : bankingSystem) {
                        if (system.search(ac_no)) {
                            system.withdraw();
                            break;
                        }
                    }
                }

                // Remaining balance
                else if (var == 4){
                    System.out.print("Enter Account no: ");
                    String ac_no = in.next();
                    for (BankingSystem system : bankingSystem) {
                        if (system.search(ac_no)) {
                            system.showAccountInfo();
                            break;
                        }
                    }
                }
                // Exit
                else if (var == 5){
                    done = false;
                }
        }
    }
}
