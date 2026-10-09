import java.util.Scanner;

public class Ex02_Bank_Account_Management {

    long accountNumber;
    String customerName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        Ex02_Bank_Account_Management account =
                new Ex02_Bank_Account_Management();

        account.read();
        account.deposit();
        account.withdraw();
        account.display();
    }
}