package dev.hemanth.jfs.controlflow;

/**
 * Demonstrates the difference between legacy switch (Java 8)
 * and modern switch expressions (Java 12+).
 *
 * Refer:
 * docs/02-control-flow-and-operators/01-control-flow-and-switch.md
 * Section 3 – Legacy switch
 * Section 4 – Modern switch expression
 */
public class SwitchLegacyVsModern {

    public static void main(String[] args) {

        int day = 2;

        // ===== Legacy switch (fall-through risk) =====
        String legacyResult;
        switch (day) {
            case 1:
                legacyResult = "Monday";
                break;
            case 2:
                legacyResult = "Tuesday";
                break;
            default:
                legacyResult = "Unknown";
        }

        System.out.println("Legacy switch result: " + legacyResult);

        // ===== Modern switch expression (Java 12+) =====
        String modernResult = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Unknown";
        };

        System.out.println("Modern switch result: " + modernResult);
    }
}