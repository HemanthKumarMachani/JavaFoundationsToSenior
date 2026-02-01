package dev.hemanth.jfs.inheritance;

/**
 * Demonstrates basic inheritance and "is-a" relationship.
 *
 * Refer:
 * docs/07-inheritance-and-polymorphism/01-inheritance-polymorphism-overriding.md
 * Section 1 – What inheritance really is
 */
public class InheritanceBasics {

    static class Animal {
        void eat(Animal animal) {
            System.out.println(animal.getClass().getName() +" eats" );
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(d);   // inherited behavior
        d.bark();  // specialized behavior
    }
}