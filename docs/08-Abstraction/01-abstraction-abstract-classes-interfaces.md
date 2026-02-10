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
**Key properties:**
- No instance state (except constants)
- Methods are implicitly public
- Supports multiple inheritance

⸻

**Java 8+ interface evolution**

Since Java 8, interfaces can have:
- default methods (with implementation)
- static methods
- private helper methods (Java 9+)

This allows:
- Backward-compatible API evolution
- Shared behavior without breaking implementations

⸻

## 6. Abstract Class vs Interface (Conceptual Difference)

This is **not** about syntax.

**Abstract class:**
- Represents **what something is**
- Models a base type
- Allows shared state

**Interface:**
- Represents **what something can do**
- Models a capability or role
- Focuses on behavior, not state

**Senior-level explanation:**

> Abstract classes model inheritance of identity. Interfaces model inheritance of capability.

⸻

## 7. Multiple Inheritance: Why Interfaces Exist

Java does not allow multiple inheritance of classes because:
- Diamond problem
- Ambiguous state resolution

Interfaces avoid this by:
- Allowing multiple inheritance of behavior
- Enforcing explicit conflict resolution for default methods

⸻

## 8. Default Methods (Important Interview Topic)

```java
interface Logger {
    default void log(String msg) {
        System.out.println(msg);
    }
}
```
Why they exist:
•	To evolve interfaces without breaking existing implementations
•	To share behavior safely

Conflict rule:
- Class methods win over interface default methods
- If two interfaces provide same default method → class must override

⸻

## 9. Abstraction + Polymorphism (How They Work Together)

Abstraction enables polymorphism by:
- Allowing code to depend on abstract types
- Letting runtime choose implementation
```java
PaymentService service = new StripePaymentService();
service.pay(100);
```
Caller does not know or care about implementation details.