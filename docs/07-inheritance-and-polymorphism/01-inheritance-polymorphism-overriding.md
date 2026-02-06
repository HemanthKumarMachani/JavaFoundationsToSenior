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

## 3. Polymorphism: Why It Exists

Polymorphism allows:
- Writing code against abstractions (parent types)
- Plugging in different implementations without changing client code

Example:

```java
void makeSound(Animal a) {
    a.sound();
}
```
The caller decides which subclass to pass:
- Dog
- Cat
- Bird

**Senior explanation you can say:**

Polymorphism allows behavior to vary at runtime while keeping code stable and extensible.

## 4. Method Overriding (Runtime Polymorphism)

Method overriding means:
- Same method signature
- In subclass
- Runtime decision

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}
```

```java
Animal a = new Dog();
a.sound(); // Bark
```
Why?
- JVM uses **dynamic dispatch**
- Method call resolved based on actual object type, not reference type

⸻

## 5. How JVM Resolves Overridden Methods (Internals)

At runtime:
1.	JVM looks at the **actual object**
2.	Finds the most specific overridden method
3.	Executes that method

This is done using internal method tables (vtable-like structures).

**Key rule:**

Instance methods are resolved at runtime.
Overloaded and static methods are resolved at compile time.

⸻

## 6. What Is NOT Polymorphic (Very Important)

**Fields are NOT polymorphic**

```java
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

Parent p = new Child();
System.out.println(p.x); // 10
```
Why?
- Fields are accessed using **reference type**
- Only methods participate in dynamic dispatch

⸻

**Static methods are NOT polymorphic**

Static methods are hidden, not overridden.

```java
class Parent {
    static void greet() { System.out.println("Parent"); }
}

class Child extends Parent {
    static void greet() { System.out.println("Child"); }
}
```
```java
Parent p = new Child();
p.greet(); // Parent
```

## 7. The super Keyword (Deep Meaning)

super refers to the parent portion of the current object.

Uses:
1.	Call parent constructor
2.	Call parent method
3.	Access parent fields (rare, but possible)

```java
super.sound();
```
Why it exists:
- Allows reuse of parent logic
- Prevents duplication
- Makes overriding extensible

⸻

## 8. Constructor Execution Order in Inheritance

When you create a child object:
1.	Parent class static initialization (once)
2.	Child class static initialization (once)
3.	Parent instance initialization
4.	Parent constructor
5.	Child instance initialization
6.	Child constructor

**Why this order exists:**

> A child must never observe an uninitialized parent.

⸻

## 9. final and Inheritance

**final class**
- Cannot be extended
- Used for security and immutability (e.g., String)

**final method**
- Cannot be overridden
- Locks behavior

**final fields**
- Must be initialized once
- Helps create immutable objects

⸻

## 10. Common Interview Traps (And How to Explain Them)

**Trap 1: “Why does this print parent value?”**

→ Because fields are not polymorphic.

**Trap 2: “Why isn’t my static method overridden?”**

→ Static methods use compile-time binding.

**Trap 3: “Why does child constructor force a super call?”**

→ Parent must be fully initialized first.

⸻

## 11. Interview Scripts (Say This Confidently)

**Polymorphism**

> Polymorphism means the same method call can execute different implementations based on the actual object type at runtime, not the reference type.

**Overriding**

> Overridden instance methods use dynamic dispatch, resolved by the JVM at runtime.

**Fields**

> Fields are accessed using reference type and are not polymorphic.

**Static**

> Static methods are resolved at compile time and are hidden, not overridden.

