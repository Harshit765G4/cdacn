import java.util.Scanner;

class BankAccount {

    long accountNo;
    String accountHolderName;
    double balance;

    BankAccount(long accountNo, String accountHolderName,
                double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 2 / 100;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: Rs. %.2f%n", balance);
        System.out.printf("Interest: Rs. %.2f%n", calculateInterest());
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(long accountNo, String name,
                   double balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    double interestRate;

    CurrentAccount(long accountNo, String name,
                   double balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

public class Ex03_Bank_Account_Interest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Savings Account ---");

        System.out.print("Enter Account Number: ");
        long savingsNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String savingsName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double savingsBalance = sc.nextDouble();

        System.out.print("Enter Savings Interest Rate (%): ");
        double savingsRate = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(
            savingsNo, savingsName, savingsBalance, savingsRate
        );

        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();

        sc.nextLine();

        System.out.println("\n--- Current Account ---");

        System.out.print("Enter Account Number: ");
        long currentNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String currentName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double currentBalance = sc.nextDouble();

        System.out.print("Enter Current Account Interest Rate (%): ");
        double currentRate = sc.nextDouble();

        CurrentAccount current = new CurrentAccount(
            currentNo, currentName, currentBalance, currentRate
        );

        System.out.println("\nCurrent Account Details:");
        current.displayAccountDetails();

        sc.close();
    }
}