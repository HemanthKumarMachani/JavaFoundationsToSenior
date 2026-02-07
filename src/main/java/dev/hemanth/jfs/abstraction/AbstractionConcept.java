package dev.hemanth.jfs.abstraction;

/**
 * Demonstrates abstraction as a contract-based design.
 *
 * Refer:
 * docs/08-abstraction/01-abstraction-abstract-classes-interfaces.md
 * Section 1 – What abstraction really is
 * Section 2 – Why abstraction exists
 */
public class AbstractionConcept {

    interface PaymentService {
        void pay(double amount);
    }

    static class CreditCardPaymentService implements PaymentService {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class UpiPaymentService implements PaymentService {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }

    public static void main(String[] args) {
        // Caller depends only on abstraction
        PaymentService service = new CreditCardPaymentService();
        service.pay(500);

        service = new UpiPaymentService();
        service.pay(300);
    }
}