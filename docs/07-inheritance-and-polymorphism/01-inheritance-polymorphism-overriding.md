# Inheritance & Polymorphism (Java 8–25)

This document focuses on **how Java behaves at runtime**, not just what compiles.

---

## 1. What Inheritance Really Is

Inheritance allows a class (child/subclass) to:
- Reuse behavior and state from another class (parent/superclass)
- Specialize or modify behavior via overriding
- Be treated as the parent type (polymorphism)

```java
class Animal { }
class Dog extends Animal { }
```
**But important reality:**

- Inheritance does NOT mean the child becomes the parent.
- It means the child contains the parent part + its own additions.

**At runtime:**
- A Dog object contains Animal state + Dog state
- The JVM tracks the actual object type separately from the reference type
## 2. Reference Type vs Object Type (Critical Concept)
```java
Animal a = new Dog();
```
There are two types involved:
- Reference type → Animal (compile-time)
- Object type → Dog (runtime)

Why this matters:
- Reference type controls what is accessible
- Object type controls what actually executes

This distinction explains almost every polymorphism interview question.