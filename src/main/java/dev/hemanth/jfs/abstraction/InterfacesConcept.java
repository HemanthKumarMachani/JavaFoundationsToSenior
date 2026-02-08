package dev.hemanth.jfs.abstraction;

/**
 * Demonstrates interface behavior and default methods.
 *
 * Refer:
 * docs/08-abstraction/01-abstraction-abstract-classes-interfaces.md
 * Section 5 – Interfaces
 * Section 8 – Default methods
 */
public class InterfacesConcept {

    interface Logger {
        default void log(String msg) {
            System.out.println("[LOG] " + msg);
        }
    }

    static class FileLogger implements Logger { }

    public static void main(String[] args) {
        Logger logger = new FileLogger();
        logger.log("Application started");
    }
}