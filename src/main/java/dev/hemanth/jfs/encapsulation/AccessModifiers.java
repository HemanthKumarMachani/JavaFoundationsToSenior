package dev.hemanth.jfs.encapsulation;

/**
 * Demonstrates visibility rules.
 *
 * Refer:
 * docs/09-encapsulation/01-encapsulation-access-modifiers-immutability.md
 * Section 3 – Access modifiers
 */
public class AccessModifiers {

    private static class PrivateClass {
        // Only accessible inside outer class
    }

    static class PackagePrivateClass {
        // Accessible within same package
    }

    protected static class ProtectedClass {
        // Accessible to subclasses
    }

    public static class PublicClass {
        // Accessible everywhere
    }
}