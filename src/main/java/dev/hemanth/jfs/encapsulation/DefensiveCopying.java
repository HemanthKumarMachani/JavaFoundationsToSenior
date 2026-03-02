package dev.hemanth.jfs.encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates defensive copying.
 *
 * Refer:
 * docs/09-encapsulation/01-encapsulation-access-modifiers-immutability.md
 * Section 5 – Defensive copying
 */
public class DefensiveCopying {

    static class Order {
        private final List<String> items;

        public Order(List<String> items) {
            // Defensive copy during construction
            this.items = new ArrayList<>(items);
        }

        public List<String> getItems() {
            // Defensive copy on return
            return new ArrayList<>(items);
        }
    }

    public static void main(String[] args) {
        List<String> initial = new ArrayList<>();
        initial.add("Laptop");

        Order order = new Order(initial);

        List<String> leaked = order.getItems();
        leaked.add("Phone");

        System.out.println(order.getItems()); // Phone not added
    }
}