package dev.hemanth.jfs.operators;

/**
 * Demonstrates operator precedence traps used in interviews.
 *
 * Refer:
 * docs/04-operators-and-precedence/01-operators-and-precedence.md
 * Sections 9 & 10
 */
public class OperatorPrecedenceTraps {

    public static void main(String[] args) {

        int result = 5 + 3 * 2;
        System.out.println(result); // 11

        int x = 5;
        int y = x++ + ++x;
        System.out.println("x = " + x); // 7
        System.out.println("y = " + y); // 12
    }
}