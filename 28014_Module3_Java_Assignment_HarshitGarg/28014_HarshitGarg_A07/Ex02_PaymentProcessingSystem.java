interface Payment {
    void processPayment(double amount);
    void displayPaymentDetails();
}

class UPIPayment implements Payment {
    private String transactionId;
    private String upiId;

    public UPIPayment(String transactionId, String upiId) {
        this.transactionId = transactionId;
        this.upiId = upiId;
    }

    public void processPayment(double amount) {
        System.out.println("UPI Payment Amount: ₹" + amount);
        System.out.println("Transaction ID: " + transactionId);
    }

    public void displayPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment implements Payment {
    private String transactionId;
    private String cardNumber;

    public CardPayment(String transactionId, String cardNumber) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
    }

    public void processPayment(double amount) {
        System.out.println("Card Payment Amount: ₹" + amount);
        System.out.println("Transaction ID: " + transactionId);
    }

    public void displayPaymentDetails() {
        System.out.println("Payment Method: Card");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Card Number: " + cardNumber);
    }
}

public class Ex02_PaymentProcessingSystem {
    public static void main(String[] args) {
        Payment upi = new UPIPayment("UPI1001", "harshit@upi");
        Payment card = new CardPayment(
            "CARD2001", "XXXX-XXXX-XXXX-1234"
        );

        System.out.println("=== UPI Payment ===");
        upi.processPayment(1200);
        upi.displayPaymentDetails();

        System.out.println("\n=== Card Payment ===");
        card.processPayment(2500);
        card.displayPaymentDetails();
    }
}
