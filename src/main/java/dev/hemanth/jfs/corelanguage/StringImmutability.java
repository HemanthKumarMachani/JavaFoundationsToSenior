package dev.hemanth.jfs.corelanguage;

public class StringImmutability {

    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");

        System.out.println(s); // Hello

        s = s.concat(" World");
        System.out.println(s); // Hello World
    }
}