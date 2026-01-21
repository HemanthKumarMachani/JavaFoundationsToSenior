# Operators & Operator Precedence (Java 8–25)

---

## 1. Categories of Operators

Java operators are grouped into:

- Arithmetic (`+ - * / %`)
- Unary (`++ -- !`)
- Relational (`< > <= >= == !=`)
- Logical (`&& ||`)
- Bitwise (`& | ^ ~`)
- Assignment (`= += -= *=`)
- Ternary (`?:`)

Interview focus:
> “Can you predict the exact output without running the code?”

---

## 2. Arithmetic Operators

Used for mathematical calculations.

```java
int a = 10;
int b = 3;

System.out.println(a / b); // 3
System.out.println(a % b); // 1
```
- Key points:
  -	Integer division truncates decimals
  -	% returns remainder
  -	Division by zero causes ArithmeticException
## 3. Unary Operators (++ / –)

- Post-increment vs Pre-increment

```java
int x = 5;
System.out.println(x++); // prints 5, then increments
System.out.println(++x); // increments first, then prints
```
> Interview trap: Know when the increment happens.

## 4. Relational and Equality Operators
```java
int a = 10;
int b = 20;

System.out.println(a < b);  // true
System.out.println(a == b); // false
```
Important:
-	== compares values for primitives
-	== compares references for objects
## 5. Logical vs Bitwise Operators

- Logical operators (short-circuit)
```java
if (a > 0 && expensiveCheck()) { }
```
- && stops if left side is false
- || stops if left side is true

- Bitwise operators (no short-circuit)
```java
if (a > 0 & expensiveCheck()) { }
```
- Both sides always evaluated
- Common OCP trick

## 6. Short-Circuit Evaluation (Critical)
```java
int x = 0;
if (x != 0 && 10 / x > 1) {
        // safe, second condition never evaluated
        }
```
- Why this matters:
  -	Prevents NullPointerException
  -	Prevents ArithmeticException
  - Improves performance

## 7. Assignment Operators7. Assignment Operators
```java
int x = 10;
x += 5;  // x = x + 5
```
- Trap:
```java
short s = 10;
s += 1; // compiles
s = s + 1; // does NOT compile
```

## 8. Ternary Operator (?:)
```java
int max = (a > b) ? a : b;
```
- Rules:
  -	Both branches must be compatible types
  -	Often nested incorrectly (avoid deep nesting)

## 9. Operator Precedence (High-Value Interview Topic)

Order (high → low):
1.	Unary (++ -- !)
2.	Multiplicative (* / %)
3.	Additive (+ -)
4.	Relational (< >)
5.	Equality (== !=)
6.	Logical AND (&&)
7.	Logical OR (||)
8.	Ternary (?:)
9.	Assignment (=)

Rule:

When in doubt, use parentheses.

## 10. Common Interview & OCP Traps

- Trap 1: Precedence confusion
```java
int x = 5 + 3 * 2; // 11, not 16
```
- Trap 2: Increment confusion
```java
int x = 5;
int y = x++ + ++x;
```
- Trap 3: Bitwise vs logical
```java
if (true | false) { }  // valid
if (true || false) { } // also valid, but different behavior
```

## 11. Interview One-Liners (Memorize)
	•	&& and || short-circuit
	•	& and | always evaluate both sides
	•	++x increments before use
	•	x++ increments after use
	•	Integer division truncates
	•	Operator precedence matters
	•	Use parentheses for clarity