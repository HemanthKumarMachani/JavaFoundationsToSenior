package dev.hemanth.jfs.operators;

/**
 * Demonstrates short-circuit behavior vs non-short-circuit behavior.
 *
 * Refer:
 * docs/04-operators-and-precedence/01-operators-and-precedence.md
 * Section 6 – Short-circuit evaluation
 */
public class ShortCircuitEvaluation {

    public static void main(String[] args) {

        int x = 0;

        // Safe: second condition is skipped
        if (x != 0 && 10 / x > 1) {
            System.out.println("Safe execution");
        }

        // Unsafe: both sides evaluated (commented to prevent crash)
        // if (x != 0 & 10 / x > 1) {
        //     System.out.println("This will throw ArithmeticException");
        // }
    }
}