import java.util.*;

public class BankAccountManagement {
	
	long accountNumber; String customerName; double balance;
	
	// Global Scanner
	Scanner sc = new Scanner(System.in);
	
	public void read() {
		
		System.out.println("Enter the Account Number of User: ");
		accountNumber = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the Name of the user: ");
		customerName = sc.nextLine();
		
		System.out.println("Enter the Balance: ");
		balance = sc.nextDouble();
		sc.nextLine();
	}
	
	public void deposite() {
		
		System.out.println("Enter the Amount to deposite: ");
		double depositeAmount = sc.nextDouble();
		sc.nextLine();
		
		balance = balance + depositeAmount;
		System.out.println("The new Balance Amount:"+" "+ balance);
		
	}
	
	public void withdraw() {
		
		System.out.println("Enter the Amount to Withdraw: ");
		double withdrawAmount = sc.nextDouble();
		sc.nextLine();
		
		if(withdrawAmount <= balance) {
			
			balance = balance - withdrawAmount;
			System.out.println("The new Balance Amount:"+" "+ balance);
		}
		else {
			System.out.println("Enter a valid Amount for withdrawal, current balance is: "+" "+ balance);
		}
		
	}
	
	public void display() {
		
		System.out.println("--- ACCOUNT DETAILS ---");
		System.out.println("ACCOUNT ID:" +" "+ accountNumber);
		System.out.println("Account Name:" +" "+ customerName);
		System.out.println("Balance:" +" "+ balance);
		
	}
	
	public static void main(String args[]) {
		
		BankAccountManagement obj1 = new BankAccountManagement();
		BankAccountManagement obj2 = new BankAccountManagement();
		BankAccountManagement obj3 = new BankAccountManagement();
		
		obj1.read();
		obj1.deposite();
		obj1.withdraw();
		obj1.display();
		
		obj2.read();
		obj2.deposite();
		obj2.withdraw();
		obj2.display();
		
		obj3.read();
		obj3.deposite();
		obj3.withdraw();
		obj3.display();
	}
}
