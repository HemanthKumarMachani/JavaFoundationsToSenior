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

## Problem 2: Change amplification

If implementation details leak:
•	Every change forces multiple updates
•	Bugs spread easily

Abstraction limits change impact.

⸻

## Problem 3: Testing difficulty

Abstraction enables:
•	Mocking
•	Stubbing
•	Isolated unit tests

⸻

## 3. Abstraction in Java: Two Mechanisms

Java provides abstraction via:
1.	**Abstract classes**
2.	**Interfaces**

Both represent **incomplete types** that cannot be instantiated.

⸻

## 4. Abstract Classes (Deep Explanation)

An abstract class:
- Represents an **“is-a”** relationship
- Can contain:
- Abstract methods (no implementation)
- Concrete methods
- Instance fields
- Constructors

```java
abstract class Vehicle {
abstract void move();
}
```
**Key design intent**

Use abstract classes when:
- You want to share **base state or behavior**
- You expect subclasses to be closely related
- You control the inheritance hierarchy

⸻

**Runtime behavior**
•	Abstract methods have **no method body**
•	Subclass must implement abstract methods
•	Abstract methods participate in runtime polymorphism

⸻

## 5. Interfaces (Deep Explanation)

An interface represents a pure contract.

```java
interface PaymentService {
    void pay(double amount);
}
```

