package dev.hemanth.jfs.methods;

/**
 * Demonstrates Java parameter passing rules.
 *
 * Refer:
 * docs/05-methods-and-parameter-passing/01-methods-overloading-varargs-params.md
 * Section 3 – Parameter Passing
 */
public class ParameterPassing {

    public static void main(String[] args) {

        int x = 5;
        updatePrimitive(x);
        System.out.println(x); // still 5

        StringBuilder sb = new StringBuilder("Hello");
        updateObject(sb);
        System.out.println(sb); // Hello!
    }

    static void updatePrimitive(int value) {
        // value is a copy of x
        value = 100;
    }

    static void updateObject(StringBuilder builder) {
        // builder is a copy of the reference
        // object mutation is visible
        builder.append("!");
    }
}