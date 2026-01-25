package dev.hemanth.jfs.methods;

/**
 * Demonstrates varargs behavior and rules.
 *
 * Refer:
 * docs/05-methods-and-parameter-passing/01-methods-overloading-varargs-params.md
 * Section 6 – Varargs
 */
public class VarArgs {

    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers();
    }

    static void printNumbers(int... numbers) {
        // numbers is treated as an int[] internally
        System.out.println("Count: " + numbers.length);
    }
}