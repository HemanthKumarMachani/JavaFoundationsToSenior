package dev.hemanth.jfs.corelanguage;
/**
 * Demonstrates tricky wrapper/== behavior used in interviews and OCP exams.
 */
public class AutoboxingPitfalls {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b? " + (a == b)); // true (cached by Integer pool)
        System.out.println("a == b? " + (a.equals(b)));
        Integer c = 200; // outside cache
        Integer d = 200;
        System.out.println("c == d? " + (c == d)); // false (outside cache range)
        System.out.println("c == d? " + (c.equals(d)));
        /*
            == vs .equals():
                == check for Same reference(for objects0 , same value(for primitives)
                .equals() checks for logical value equality
         */
        Integer n = null;
        try {
            int z = n; // auto-unboxing leads to NullPointerException
        }catch (Exception e) {
            System.out.println("Auto-unboxing from null lead to: " +e);
        }
        //Converting from Primitive to Wrapper is Auto-boxing and vice versa is auto-unboxing.
    }
}
