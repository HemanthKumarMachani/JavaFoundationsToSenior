package dev.hemanth.jfs.classes;

/**
 * Demonstrates:
 * - static is class-level shared state
 * - instance state is per object
 * - why static can be dangerous if misused (global coupling)
 *
 * Refer:
 * docs/06-classes-and-objects/01-classes-objects-constructors-this.md
 * Section 3 – Instance vs static
 */
public class StaticVsInstance {

    static class Counter {
        // Static field: one per class (per classloader). Shared across all instances.
        static int createdCount = 0;

        // Instance field: each object has its own copy.
        int instanceId;

        Counter() {
            createdCount++;         // affects global shared state
            instanceId = createdCount; // each instance stores its ID at creation time
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Global createdCount = " + Counter.createdCount); // 3
        System.out.println("c1.instanceId = " + c1.instanceId); // 1
        System.out.println("c2.instanceId = " + c2.instanceId); // 2
        System.out.println("c3.instanceId = " + c3.instanceId); // 3

        // Interview angle:
        // Static state is shared. In multi-threaded apps, this needs synchronization.
        // In tests, static state can leak across test cases if not reset.
    }
}