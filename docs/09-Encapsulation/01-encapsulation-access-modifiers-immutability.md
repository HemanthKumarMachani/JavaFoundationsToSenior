# Encapsulation & Access Modifiers (Java 8–25) — Deep Explanation

Encapsulation is often misunderstood as:
> “Make fields private.”

That is incomplete.

True encapsulation means:
> Protecting the internal state of an object and controlling how it changes.

---

## 1. What Encapsulation Really Is

Encapsulation combines:
- Data hiding
- Controlled access
- Invariant protection
- API boundary enforcement

If external code can freely modify your object’s state,
you lose control over correctness.

Encapsulation ensures:
- Object state is always valid
- Changes go through defined rules
- Internal representation can change without breaking callers

---

## 2. Why Encapsulation Exists (Real-World Problems)

### Problem 1: Invalid State

Without encapsulation:
```java
user.age = -10;
```
Now your system has invalid data.

With encapsulation:
```java
setAge(int age) {
    if (age < 0) throw exception;
}
```
## Problem 2: Breaking invariants

**Example:**
- Bank account balance must never be negative.
- Order status must follow valid transitions.

Encapsulation protects those invariants.

## 3. Access Modifiers (Deep Understanding)

Java provides four access levels:


| Modifier          | Same Class | Same Package | Subclass | Other Packages | 
|-------------------|------------|--------------|----------|----------------|
| private           | Yes        | No           | No       | No             |
| default (package) | Yes        | Yes          | No       | No             |
| protected         | Yes        | Yes          | Yes      | No             |
| public            | Yes        | Yes          | Yes      | Yes            |

**private**
- Most restrictive
- Best for fields
- Enforces strong encapsulation

⸻

**package-private (default)**
- Used within modules
- Often best for internal implementation classes
- Encourages package-level design

⸻

**protected**
- Allows subclass access
- Be careful: exposes internal details to subclasses
- Can weaken encapsulation

⸻

**public**
- Forms API boundary
- Must be designed carefully
- Once public, hard to change

⸻

## 4. Encapsulation + Immutability

The strongest form of encapsulation is immutability.

Immutable objects:
•	Cannot change after creation
•	Automatically thread-safe
•	Easier to reason about

Example:

```java
final class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```
> No setter = state cannot change.
