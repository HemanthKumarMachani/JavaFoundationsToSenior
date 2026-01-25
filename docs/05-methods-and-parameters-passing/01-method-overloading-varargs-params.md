# Methods & Parameter Passing (Java 8–25)

---

## 1. What is a Method in Java?

A method:
- Encapsulates behavior
- Executes on the call stack
- Receives parameters by value
- May return a value

Syntax:
```java
returnType methodName(parameterList) {
    // body
}
```
## 2. Method Calls & Stack Frames

When a method is called:
- A new stack frame is created
- Parameters and local variables live in that frame
- After execution, the frame is removed

> Interview focus: “Each method call gets its own stack frame.”

## 3. Parameter Passing in Methods

> Java is always pass-by-value.

- Primitive type 'Value' is passed.
- Object type 'Copy of reference' is passed.
 > Mutation visible, reassignment not.

```java
void update(int x) {
x = 10;
}

void updateObj(StringBuilder sb) {
sb.append("!");
}
```
## 4. Method Overloading

Method overloading means:
•	Same method name
•	Different parameter list
•	Compile-time resolution

Valid overloads:
•	Different number of parameters
•	Different parameter types
•	Different order of parameters

❌ Return type alone cannot overload a method.

⸻

## 5. Overloading Resolution Rules (Important)

Java chooses the most specific match.

Order (simplified):
1.	Exact match
2.	Widening (int → long)
3.	Autoboxing
4.	Varargs

This order is heavily tested in interviews and OCP.

⸻

## 6. Varargs (...)

Varargs:
- Treated as arrays internally
- Must be the last parameter
- Only one varargs parameter allowed

```java
void log(String... messages) { }
```

## 7. Varargs vs Overloading (Trap)

```java
void test(int a) {}
void test(int... a) {}
```
- Calling: 
```java
test(10);
```

- ✔ Exact match wins (test(int))

⸻

## 8. Common Interview Traps
- Confusing overloading with overriding
- Expecting runtime polymorphism for overloaded methods
- Ambiguous method calls
- Incorrect assumptions about varargs priority

⸻

## 9. Interview One-Liners
- Method overloading is resolved at compile time
- Java passes parameters by value
- Varargs are arrays internally
- Exact match beats autoboxing and varargs
- Return type does not participate in overloading
