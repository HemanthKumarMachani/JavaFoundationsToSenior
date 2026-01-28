package dev.hemanth.jfs.classes;

/**
 * Demonstrates:
 * - Constructor purpose and invariant setup
 * - "this" keyword for shadowing resolution
 * - Constructor chaining using this(...)
 *
 * Refer:
 * docs/06-classes-and-objects/01-classes-objects-constructors-this.md
 * Section 4 – Constructors
 * Section 6 – this keyword
 * Section 7 – Constructor chaining
 */
public class ConstructorAndThis {

    static class Person {
        private final String name; // final instance field: must be assigned during construction

        Person() {
            // Constructor chaining: calls another constructor in the same class.
            // Rule: must be the FIRST statement.
            this("Unknown");
        }

        Person(String name) {
            // Shadowing occurs because parameter name == field name.
            // "this.name" refers to the field. "name" refers to parameter.
            this.name = name;

            // Real-world: constructor is where you enforce invariants.
            // Example: you might validate name here. (Kept simple for demo.)
        }

        void print() {
            System.out.println("Person{name='" + name + "'}");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();           // uses chained constructor
        Person p2 = new Person("Hemanth");  // uses parameter constructor

        p1.print();
        p2.print();
    }
}