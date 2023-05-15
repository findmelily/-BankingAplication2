package bankingapplication2;

import java.util.Scanner;

public class BankingApplication2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("My Bank");
        int option = 0;
        String accountName;
        int accountNumber;
        double amount;
        
        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New Account​");
            System.out.println("3. Close Existing Account​");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("Enter your choice : ");
            option = scan.nextInt();
            //scan.nextLine();

            switch (option) {
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    accountNumber = 111111;
                    accountName = "Henry";
                    bank.openAccount(accountNumber, accountName);
                    break;
                case 3:
                    accountNumber = 111111;
                    bank.closeAccount(accountNumber);
                    break;
                case 4: 
                    accountNumber =111111;
                    amount = 500;
                    bank.depositMoney(accountNumber, amount);
                    break;
                case 5:
                    accountNumber =111111;
                    amount = 500;
                    bank.withdrawMoney(accountNumber, amount);
                    break;
            }
            System.out.println();
        }
        
    }
}
