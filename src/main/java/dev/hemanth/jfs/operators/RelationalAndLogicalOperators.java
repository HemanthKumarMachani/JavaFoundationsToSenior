package dev.hemanth.jfs.operators;

/**
 * Demonstrates relational and logical operators.
 *
 * Refer:
 * docs/04-operators-and-precedence/01-operators-and-precedence.md
 * Sections 4 & 5
 */
public class RelationalAndLogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a < b);   // true
        System.out.println(a == b);  // false

        // Logical AND (short-circuit)
        if (a > 0 && expensiveCheck()) {
            System.out.println("Will not reach here");
        }
    }

    private static boolean expensiveCheck() {
        System.out.println("Expensive check executed");
        return true;
    }
}