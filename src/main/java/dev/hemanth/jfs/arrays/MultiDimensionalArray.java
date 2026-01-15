package dev.hemanth.jfs.arrays;

/**
 * Demonstrates jagged (non-rectangular) arrays in Java.
 *
 * Refer:
 * docs/03-arrays-and-memory/01-arrays-memory-layout.md
 * Section 7 – Multidimensional arrays
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] matrix = new int[3][];

        // Each row can have different length
        matrix[0] = new int[]{1, 2};
        matrix[1] = new int[]{3, 4, 5};
        matrix[2] = new int[]{6};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}