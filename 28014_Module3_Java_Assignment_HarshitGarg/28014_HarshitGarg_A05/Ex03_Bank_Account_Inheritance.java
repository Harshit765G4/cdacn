import java.util.Scanner;

class BankAccount {

    long accountNo;
    String accountHolderName;
    double balance;

    BankAccount(long accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: %.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(long accountNo, String name, double balance,
                   double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void displaySavingsDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.printf("Interest: %.2f%n", calculateInterest());
    }
}

class CurrentAccount extends BankAccount {

    double overdraftLimit;

    CurrentAccount(long accountNo, String name, double balance,
                   double overdraftLimit) {
        super(accountNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraftLimit() {
        System.out.printf("Available Overdraft: %.2f%n",
                          overdraftLimit);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    void displayCurrentAccountDetails() {
        displayAccountDetails();
        System.out.printf("Overdraft Limit: %.2f%n", overdraftLimit);
        checkOverdraftLimit();
    }
}

public class Ex03_Bank_Account_Inheritance {

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

        System.out.print("Enter Interest Rate (%): ");
        double rate = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(
            savingsNo, savingsName, savingsBalance, rate
        );

        System.out.print("Enter deposit amount: ");
        savings.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        savings.withdraw(sc.nextDouble());

        System.out.println("\nSavings Account Details:");
        savings.displaySavingsDetails();

        sc.nextLine();

        System.out.println("\n--- Current Account ---");

        System.out.print("Enter Account Number: ");
        long currentNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String currentName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double currentBalance = sc.nextDouble();

        System.out.print("Enter Overdraft Limit: ");
        double limit = sc.nextDouble();

        CurrentAccount current = new CurrentAccount(
            currentNo, currentName, currentBalance, limit
        );

        System.out.print("Enter withdrawal amount: ");
        current.withdraw(sc.nextDouble());

        System.out.println("\nCurrent Account Details:");
        current.displayCurrentAccountDetails();

        sc.close();
    }
}