package dev.hemanth.jfs.encapsulation;

/**
 * Demonstrates controlled state modification.
 *
 * Refer:
 * docs/09-encapsulation/01-encapsulation-access-modifiers-immutability.md
 * Section 1 & 2 – What encapsulation really is
 */
public class EncapsulationBasics {

    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println(account.getBalance());
    }
}