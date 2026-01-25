package dev.hemanth.jfs.methods;

/**
 * Demonstrates common method-related interview traps.
 *
 * Refer:
 * docs/05-methods-and-parameter-passing/01-methods-overloading-varargs-params.md
 * Sections 7 & 8 – Traps
 */
public class MethodInterviewTraps {

    public static void main(String[] args) {
        demo(10);
    }

    static void demo(int x) {
        System.out.println("Exact int match");
    }

    static void demo(int... x) {
        System.out.println("Varargs version");
    }
}