# Control Flow & Switch (Java 8–25)

## 1. Control Flow Basics

Control flow determines **which statements execute and when**.

Core constructs:
- if / else
- switch
- for / while / do-while
- break / continue / return

Interview focus:
> “Explain how Java decides which block of code executes.”

---

## 2. if / else (Evaluation Rules)

- Conditions must evaluate to `boolean`
- No truthy/falsy like JavaScript
- Short-circuit behavior applies (`&&`, `||`)

Example:
```java
if (a > 0 && expensiveCheck()) {
    // expensiveCheck() only runs if a > 0
}