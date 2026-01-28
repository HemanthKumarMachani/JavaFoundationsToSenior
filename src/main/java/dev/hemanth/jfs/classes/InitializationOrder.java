package dev.hemanth.jfs.classes;

/**
 * Demonstrates initialization order:
 * 1) static fields + static blocks (once per class load)
 * 2) instance fields + instance init blocks (per object)
 * 3) constructor body (per object)
 *
 * Refer:
 * docs/06-classes-and-objects/01-classes-objects-constructors-this.md
 * Section 8 – Initialization order
 */
public class InitializationOrder {

    // ---- (1) Static initialization: runs once when the class is first loaded ----

    static int staticField = log("1. staticField initializer");

    static {
        log("2. static block");
    }

    // ---- (2) Instance initialization: runs every time you create a new object ----

    int instanceField = log("3. instanceField initializer");

    {
        log("4. instance initializer block");
    }

    // ---- (3) Constructor: runs after instance initializers ----
    public InitializationOrderDemo() {
        log("5. constructor body");
    }

    private static int log(String msg) {
        System.out.println(msg);
        return 0;
    }

    public static void main(String[] args) {
        log("---- Creating first object ----");
        new InitializationOrderDemo();

        log("---- Creating second object ----");
        new InitializationOrderDemo();
    }
}