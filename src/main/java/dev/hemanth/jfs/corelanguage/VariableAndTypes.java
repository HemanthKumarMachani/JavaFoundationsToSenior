package dev.hemanth.jfs.corelanguage;
/**
 * Demonstrates:
 * - Primitive vs reference assignment
 * - Pass-by-value in Java
 * - Mutability of objects vs immutability of primitives
 */
public class VariableAndTypes {
    public static void main(String[] args) {
        int a = 14;
        int b = 15;
        a = b;
        System.out.println("a = " + a);
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        StringBuilder sb1 = new StringBuilder("Howdy! ");
        StringBuilder sb2 = sb1; // sb2 points to the same object sb1
        sb2.append("Man");
        System.out.println("sb1 = "+ sb1);
        System.out.println("sb2 = "+ sb2);

    }
}
