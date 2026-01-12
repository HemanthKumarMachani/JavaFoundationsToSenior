package dev.hemanth.jfs.controlflow;

/**
 * Demonstrates common loop mistakes asked in interviews.
 *
 * Refer:
 * docs/02-control-flow-and-operators/01-control-flow-and-switch.md
 * Section 6 – Loop Constructs
 * Section 7 – Common Interview Traps
 */
public class LoopsPitFalls {

    public static void main(String[] args) {

        // Correct for-loop usage
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        // Infinite loop risk (commented intentionally)
        // for (int i = 0; i >= 0; i++) {
        //     System.out.println(i); // never terminates
        // }

        int count = 0;

        // while-loop example
        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }

        // do-while executes at least once
        int x = 10;
        do {
            System.out.println("do-while executed once even though condition is false");
        } while (x < 5);
    }
}