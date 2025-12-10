package dev.hemanth.jfs.foundations;

/**
 * Demonstrates:
 *  - Reading command-line arguments
 *  - Basic decision making (if/else)
 *  - Extracting logic into a separate method for readability
 *
 * How to run from command line (example):
 *   java dev.hemanth.jfs.foundations.HelloWorldArgs
 *   java dev.hemanth.jfs.foundations.HelloWorldArgs Hemanth
 */
public class HelloWorldArgs {

    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // No arg given -> fall back to default name.
            name = "World";
        } else {
            // Use the first argument as the name.
            name = args[0];
        }

        // Delegate the actual message building to another method.
        String greetingMessage = buildGreetingMessage(name);

        System.out.println(greetingMessage);
    }

    /**
     * Builds a greeting message for the given name.
     *
     * @param name the name to greet
     * @return a human-readable greeting message
     */
    private static String buildGreetingMessage(String name) {
        return "Hello, " + name + "! Welcome to Java Foundations to Senior.";
    }
}