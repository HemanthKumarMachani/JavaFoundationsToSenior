package dev.hemanth.jfs.arrays;

/**
 * Demonstrates basic array creation, default values, and access.
 *
 * Refer:
 * docs/03-arrays-and-memory/01-arrays-memory-layout.md
 * Sections 1, 2, 4
 */
public class ArrayBasics {

    public static void main(String[] args) {

        // Creating an int array of size 3
        int[] numbers = new int[3];

        // Arrays get default values automatically
        System.out.println(numbers[0]); // 0
        System.out.println(numbers[1]); // 0
        System.out.println(numbers[2]); // 0

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Accessing array values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
