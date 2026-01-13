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
```
- Short-circuit behavior:
  -	&& → stops if left side is false
  -	|| → stops if left side is true

- Why this matters:
  - Prevents unnecessary computation
  - Prevents NullPointerException in many cases

## 3. Legacy switch (Before Java 12)

- Legacy switch is a statement, not an expression.

  - Supported types:
  •	byte, short, char, int
  •	enum
  •	String (Java 7+)

Example:

```java
switch (day) {
      case 1:
result = "Monday";
      break;
      case 2:
result = "Tuesday";
      break;
default:
result = "Unknown";
      }
```
## Fall-through behavior (common interview trap)
```java
switch (x) {
      case 1:
      System.out.println("One");
      case 2:
          System.out.println("Two");
}
```
- Why?
  - Missing break causes execution to continue
  - This behavior is intentional but error-prone

## 4. Modern switch expression (Java 12+)

Modern switch is an expression, not just a statement.

- Key improvements:
•	Arrow syntax (->)
•	No accidental fall-through
•	Can return values
•	Cleaner and safer
```java
String result =switch (x) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      default -> "Unknown"; 
};
```
Important rules:
•	Every possible path must return a value
•	Compiler enforces exhaustiveness

## 5. Why modern switch was introduced

- Problems with legacy switch:
•	Easy to forget break
•	Harder to read
•	Error-prone in large blocks

- Modern switch advantages:
•	Safer control flow
•	Expression-based design
•	Less boilerplate
•	Better compiler checks

## Interview one-liner:

- Modern switch eliminates fall-through bugs and allows switch to be used as a value-producing expression.


