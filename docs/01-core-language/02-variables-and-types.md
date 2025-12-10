# 02 - Variables, Types, and Memory Behavior

## 1. Two kinds of types in Java

| Type | Stored in | Holds |
|------|-----------|------|
| Primitive types | Stack | Actual value |
| Reference types | Stack (reference) → Heap (object) | Memory address (pointer-like) |

### Primitive types (always store real values)
byte, short, int, long  
float, double  
char  
boolean

### Reference types
String, Arrays, Classes, Enums, Wrappers, Collections…

---

## 2. Declaration vs Initialization vs Assignment

```java
int x;        // declaration (no value yet)
//Uninitialized varialbes cannot be used. The compiler stops you.
//Instance fields get default values (eg., 0, false, null) 
x = 10;       // assignment
int y = 20;   // declaration + initialization