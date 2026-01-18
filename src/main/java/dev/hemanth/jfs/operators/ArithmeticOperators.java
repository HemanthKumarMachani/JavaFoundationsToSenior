package dev.hemanth.jfs.operators;

/**
 * Demonstrates arithmetic operator behavior.
 *
 * Refer:
 * docs/04-operators-and-precedence/01-operators-and-precedence.md
 * Section 2 – Arithmetic Operators
 */
public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Integer division truncates decimal part
        System.out.println(a / b); // 3

        // Modulus gives remainder
        System.out.println(a % b); // 1

        // Division by zero causes runtime exception
        // System.out.println(a / 0); // ArithmeticException
    }
}