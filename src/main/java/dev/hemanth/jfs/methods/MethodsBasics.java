package dev.hemanth.jfs.methods;

/**
 * Demonstrates basic method declaration and invocation.
 *
 * Refer:
 * docs/05-methods-and-parameter-passing/01-methods-overloading-varargs-params.md
 * Section 1 – What is a Method
 * Section 2 – Stack frames
 */
public class MethodsBasics {

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Result = " + result);
    }

    // Simple method that adds two integers
    static int add(int a, int b) {
        // a and b live in this method's stack frame
        return a + b;
    }
}