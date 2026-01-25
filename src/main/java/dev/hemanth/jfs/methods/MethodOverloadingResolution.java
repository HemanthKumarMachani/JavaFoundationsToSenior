package dev.hemanth.jfs.methods;

/**
 * Demonstrates method overloading resolution rules.
 *
 * Refer:
 * docs/05-methods-and-parameter-passing/01-methods-overloading-varargs-params.md
 * Sections 4 & 5 – Overloading rules
 */
public class MethodOverloadingResolution {

    public static void main(String[] args) {
        test(10);
        test(10L);
        test(Integer.valueOf(10));
    }

    static void test(int x) {
        System.out.println("int version");
    }

    static void test(long x) {
        System.out.println("long version");
    }

    static void test(Integer x) {
        System.out.println("Integer version");
    }
}