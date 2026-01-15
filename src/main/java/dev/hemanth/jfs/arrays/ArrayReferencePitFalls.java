package dev.hemanth.jfs.arrays;

/**
 * Demonstrates array mutation vs reassignment behavior.
 *
 * Refer:
 * docs/03-arrays-and-memory/01-arrays-memory-layout.md
 * Section 5 – Arrays and pass-by-value
 */
public class ArrayReferencePitFalls {

    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        modifyArray(data);
        System.out.println(data[0]); // 99 (mutation visible)

        reassignArray(data);
        System.out.println(data[0]); // 99 (reassignment NOT visible)
    }

    static void modifyArray(int[] arr) {
        // Modifies the same array object
        arr[0] = 99;
    }

    static void reassignArray(int[] arr) {
        // Only reassigns local reference
        arr = new int[]{7, 8, 9};
    }
}