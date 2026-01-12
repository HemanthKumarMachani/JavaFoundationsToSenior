package dev.hemanth.jfs.controlflow;

/**
 * Demonstrates basic if/else behavior and short-circuit evaluation.
 *
 * Refer:
 * docs/02-control-flow-and-operators/01-control-flow-and-switch.md
 * Section 2 – if / else (Evaluation Rules)
 */
public class IfElseBasics {

    public static void main(String[] args) {

        int a = 5;

        // Java requires conditions to be strictly boolean.
        // There is no concept of truthy/falsy values.
        if (a > 0) {
            System.out.println("a is positive");
        } else {
            System.out.println("a is zero or negative");
        }

        // Short-circuit evaluation example:
        // If first condition is false, the second method is NEVER called.
        if (a < 0 && expensiveOperation()) {
            System.out.println("This will never execute");
        }

        // This prints because expensiveOperation() is not invoked.
        System.out.println("Program completed safely");
    }

    private static boolean expensiveOperation() {
        System.out.println("Expensive operation executed");
        return true;
    }
}
