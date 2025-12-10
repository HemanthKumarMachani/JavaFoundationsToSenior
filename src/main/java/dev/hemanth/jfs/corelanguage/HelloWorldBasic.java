package dev.hemanth.jfs.corelanguage;

/**
 * Minimal Java program to demonstrate:
 *  - Class definition
 *  - main method as entry point
 *  - Basic console output
 *
 * This is intentionally very simple, but the comments explain
 * interview-relevant details about main().
 */
public class HelloWorldBasic {

    /**
     * Entry point of a standalone Java application.
     *
     *  - public  : JVM must be able to call it from outside the class.
     *  - static  : It belongs to the class, no object needed to invoke it.
     *  - void    : It does not return a value to the JVM.
     *  - String[] args : Command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java Foundations to Senior!");
        System.out.println("This is the simplest possible Java program you can run.");

        // Interview trick:
        // Q: What happens if you remove static or change the signature?
        // A: The JVM will not be able to find a valid entry point and will fail with an error.
    }
}