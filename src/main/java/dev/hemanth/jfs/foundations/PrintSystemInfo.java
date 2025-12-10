
package dev.hemanth.jfs.foundations;

/**
 * Demonstrates how to inspect JVM and system properties at runtime.
 *
 * This is both a "hello JVM" program and a useful debugging tool:
 * you can quickly see which Java version, vendor, and memory settings
 * are actually in use.
 *
 * How to run (from project root):
 *   1. Compile (IntelliJ will do this automatically when you run).
 *   2. Run the main method.
 */
public class PrintSystemInfo {

    public static void main(String[] args) {
        System.out.println("=== Java Runtime Information ===");
        System.out.println("Java version      : " + System.getProperty("java.version"));
        System.out.println("Java vendor       : " + System.getProperty("java.vendor"));
        System.out.println("Java home         : " + System.getProperty("java.home"));
        System.out.println("User directory    : " + System.getProperty("user.dir"));

        System.out.println("\n=== OS Information ===");
        System.out.println("OS name           : " + System.getProperty("os.name"));
        System.out.println("OS version        : " + System.getProperty("os.version"));
        System.out.println("OS architecture   : " + System.getProperty("os.arch"));

        // Runtime represents the running JVM instance.
        Runtime runtime = Runtime.getRuntime();

        System.out.println("\n=== Memory Information (in MB) ===");
        long totalMemory = runtime.totalMemory() / (1024 * 1024);
        long freeMemory  = runtime.freeMemory()  / (1024 * 1024);
        long maxMemory   = runtime.maxMemory()   / (1024 * 1024);

        System.out.println("Total memory (heap allocated) : " + totalMemory + " MB");
        System.out.println("Free memory (inside heap)     : " + freeMemory + " MB");
        System.out.println("Max memory (heap limit)       : " + maxMemory + " MB");

        // Class loader info:
        ClassLoader classLoader = PrintSystemInfo.class.getClassLoader();

        System.out.println("\n=== ClassLoader Information ===");
        // For classes loaded by the bootstrap loader, getClassLoader() returns null.
        System.out.println("ClassLoader class : " +
                (classLoader != null ? classLoader.getClass().getName()
                        : "Bootstrap ClassLoader (null)"));
    }
}