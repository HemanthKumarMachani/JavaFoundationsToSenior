package dev.hemanth.jfs.abstraction;

/**
 * Demonstrates abstract class usage and intent.
 *
 * Refer:
 * docs/08-abstraction/01-abstraction-abstract-classes-interfaces.md
 * Section 4 – Abstract classes
 */
public class AbstractClassDeep {

    static abstract class Vehicle {
        protected int speed;

        Vehicle(int speed) {
            this.speed = speed;
        }

        abstract void move();

        void printSpeed() {
            System.out.println("Speed = " + speed);
        }
    }

    static class Car extends Vehicle {

        Car(int speed) {
            super(speed);
        }

        @Override
        void move() {
            System.out.println("Car moves on road at " + speed + " km/h");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Car(80);
        v.printSpeed();
        v.move();
    }
}