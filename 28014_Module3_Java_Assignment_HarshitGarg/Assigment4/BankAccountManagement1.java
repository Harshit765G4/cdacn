import java.util.*;

public class BankAccountManagement1 {
	
	static long accountNumber = 1000000 /** auto generating account number */; String customerName; double balance; long accNum;
	
	BankAccountManagement1(Scanner sc){
		read(sc);
		accountNumber++;
		accNum = accountNumber;
	}
	
	public void read(Scanner sc) {
		
		System.out.println("Enter the Name of the user: ");
		customerName = sc.nextLine();
		
		System.out.println("Enter the Balance: ");
		balance = sc.nextDouble();
		sc.nextLine();
	}
	
	public void deposite(Scanner sc) {
		
		System.out.println("Enter the Amount to deposite: ");
		double depositeAmount = sc.nextDouble();
		sc.nextLine();
		
		balance = balance + depositeAmount;
		System.out.println("The new Balance Amount:"+" "+ balance);
		
	}
	
	public void withdraw(Scanner sc) {
		
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
		System.out.println("ACCOUNT ID:" +" "+ accNum);
		System.out.println("Account Name:" +" "+ customerName);
		System.out.println("Balance:" +" "+ balance);
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	BankAccountManagement[] obj = new BankAccountManagement[n];
		
		for(int i = 1; i < n; i++) {
			 	System.out.println("--- AMOUNT OF THE ACCOUNT --- ");
			 	obj[i] = new BankAccountManagement1(sc);
			 	obj[i].withdraw(sc);
			 	obj[i].deposite(sc); 
		}
		
		System.out.println("--- PRINTING THE DETAILS OF THE ACCOUNT ---");
		for(int i = 1; i < n; i++) {
		 	obj[i] = new BankAccountManagement1(sc);
		 	obj[i].display();
		}
		
		sc.close();	

	}
}
