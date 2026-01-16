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


