package dev.hemanth.jfs.arrays;

/**
 * Demonstrates common array-related interview traps.
 *
 * Refer:
 * docs/03-arrays-and-memory/01-arrays-memory-layout.md
 * Section 6 – Common traps
 */
public class ArrayInterviewTraps {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // Off-by-one error example (commented to prevent crash)
        // for (int i = 0; i <= arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // Correct loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // ArrayIndexOutOfBoundsException example
        try {
            System.out.println(arr[3]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught runtime array bounds error");
        }
    }
}