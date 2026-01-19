package dev.hemanth.jfs.operators;

/**
 * Demonstrates bitwise operators.
 *
 * Refer:
 * docs/04-operators-and-precedence/01-operators-and-precedence.md
 * Section 5 – Bitwise operators
 */
public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println(a & b); // 1
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 6
    }
}