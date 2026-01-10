package dev.hemanth.jfs.corelanguage;

public class StringPool {

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
    }
}