package dev.hemanth.jfs.classes;

/**
 * Demonstrates:
 * - Class vs object reality (reference vs heap object)
 * - Each object has independent instance state
 *
 * Refer:
 * docs/06-classes-and-objects/01-classes-objects-constructors-this.md
 * Section 2 – What an Object really is
 * Section 3 – Instance vs static
 */
public class ClassAndObjectBasics {

    static class Car {
        // Instance fields: each Car object gets its own copies of these.
        String model;
        int year;

        // Instance method: implicitly uses "this" (the current object).
        void printInfo() {
            System.out.println("Car{model='" + model + "', year=" + year + "}");
        }
    }

    public static void main(String[] args) {
        // "car1" is a reference variable (stack) pointing to an object on the heap.
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2024;

        // Another heap object with its own independent state.
        Car car2 = new Car();
        car2.model = "Honda";
        car2.year = 2023;

        car1.printInfo();
        car2.printInfo();

        // Key idea: references can be copied; objects are not copied automatically.
        Car alias = car1; // alias and car1 now point to the same object.
        alias.year = 2030;

        // Because alias and car1 refer to the same heap object, change is visible here:
        car1.printInfo(); // year will be 2030
    }
}