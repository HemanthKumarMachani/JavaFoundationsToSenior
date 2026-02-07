# Abstraction in Java (Java 8–25) — Deep Explanation

This document explains abstraction from **concept → language feature → runtime behavior → real-world usage**.

---

## 1. What Is Abstraction (Proper Definition)

Abstraction means:
> Defining **what behavior is expected** without exposing **how that behavior is implemented**.

In Java, abstraction:
- Separates **contract** from **implementation**
- Reduces coupling between components
- Allows behavior to vary without changing callers

This is different from:
- Encapsulation (hiding internal state)
- Inheritance (code reuse)

Abstraction is about **interfaces between components**, not inheritance hierarchies.

---

## 2. Why Abstraction Exists (Real Problems It Solves)

### Problem 1: Tight coupling

Without abstraction:
```java
PaymentService service = new CreditCardPaymentService();
```
**Problems:**
- Hard to change implementation
- Hard to test
- Hard to extend

With abstraction:
```java
PaymentService service = new StripePaymentService();
```
Caller depends on **contract**, not implementation.
