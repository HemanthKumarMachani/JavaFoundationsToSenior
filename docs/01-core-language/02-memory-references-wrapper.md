Core Java: Memory, References, Wrappers, Equality & Immutability
Purpose of this document

This document consolidates core Java concepts that are heavily tested in interviews and OCP exams, and are frequently misunderstood even by experienced developers.

Covered topics:

Java pass-by-value vs pass-by-reference

Primitive vs reference types

Wrapper classes and autoboxing

== vs .equals()

Integer caching

Immutability vs mutability

final keyword behavior

Common interview traps and tricky scenarios

This knowledge is foundational for mid to senior Java engineers.

1. Primitive Types vs Reference Types
   Primitive types

Examples: int, long, double, boolean, char

Store actual values

Typically stored on the stack

Fast, memory-efficient

Cannot be null

int a = 10;
int b = a;
b = 20;
// a is still 10

Reference types

Examples: String, arrays, classes, collections, wrapper classes

Store a reference (address) to an object

Reference stored on stack, object stored on heap

Can be null

StringBuilder sb1 = new StringBuilder("Hello");
StringBuilder sb2 = sb1;
sb1.append(" World");
// sb2 sees the same change

2. Is Java Pass-by-Reference?
   Short answer

❌ No. Java is always pass-by-value.

Correct senior-level explanation

Java passes:

Primitive values by value

Object references by value

This means:

A copy of the reference is passed

Both variables point to the same object

Object mutation is visible

Reference reassignment is not

Example: Object mutation works
void modify(StringBuilder sb) {
sb.append("!");
}

StringBuilder sb = new StringBuilder("Hi");
modify(sb);
System.out.println(sb); // Hi!


✔ The object is mutated
✔ Caller sees the change

Example: Reference reassignment fails
void reassign(StringBuilder sb) {
sb = new StringBuilder("New");
}

StringBuilder sb = new StringBuilder("Hi");
reassign(sb);
System.out.println(sb); // Hi


❌ Reassignment affects only the local copy of the reference

Why Java avoids pass-by-reference (design reasons)

Prevents accidental ownership transfer

Avoids pointer manipulation bugs (C/C++)

Improves memory safety

Simplifies concurrency and garbage collection

Makes APIs more predictable

Interview one-liner:

Java avoids pass-by-reference to keep memory management safe and predictable.

3. Wrapper Classes and Autoboxing
   What are wrapper classes?

Object representations of primitives.

Primitive	Wrapper
int	Integer
long	Long
double	Double
boolean	Boolean
Why wrappers exist

Wrappers are required for:

Collections (List<Integer>)

Generics

Nullability (e.g. DB fields)

Streams and lambdas

Reflection and annotations

Utility methods (parseInt, compare)

Autoboxing and unboxing
Integer i = 10;  // autoboxing
int x = i;       // unboxing


⚠ Danger: unboxing null

Integer n = null;
int x = n; // NullPointerException

When to avoid wrappers

Avoid wrappers when:

Writing performance-critical loops

Working with counters, indexes, math

You don’t need nullability

You want to avoid GC pressure

Rule of thumb:

Use primitives by default. Use wrappers only when required by APIs or data semantics.

4. == vs .equals()
   What == does

Primitives → compares values

Objects → compares references (identity)

What .equals() does

Compares logical equality

Depends on implementation

Common pitfall
Integer a = 100;
Integer b = 100;
System.out.println(a == b); // true

Integer c = 200;
Integer d = 200;
System.out.println(c == d); // false

5. Integer Cache (-128 to 127)
   Why this happens

Autoboxing uses:

Integer.valueOf(int)


JVM caches Integer objects in range:

-128 to +127


So:

Same cached object reused → == true

Outside range → new objects → == false

Important clarification

int can store values up to Integer.MAX_VALUE

Wrapper caching is an optimization, not a limit

Cache exists to reduce object creation

Interview tip:

Always use .equals() for wrapper comparisons.

6. Immutability vs Mutability
   Immutable objects

Examples: String, wrapper classes

Cannot be changed once created

Operations create new objects

Thread-safe by design

String s = "Hello";
s.concat(" World");
System.out.println(s); // Hello

Mutable objects

Examples: StringBuilder, collections

Object state can change

Modifications are visible through all references

StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World

Why immutability matters

Thread safety

Safer APIs

String pool optimization

Predictable behavior

7. The final Keyword (Very Common Interview Topic)
   final on variables
   final int x = 10;
   // x = 20; ❌

final StringBuilder sb = new StringBuilder("Hi");
sb.append("!");      // allowed
// sb = new StringBuilder(); ❌


✔ Reference is fixed
✔ Object may still mutate

final on methods

Cannot be overridden

Used to lock behavior

final on classes

Cannot be subclassed

Improves security and predictability

Example:

public final class String { }

8. High-Frequency Interview Traps
   Swap failure
   void swap(Integer a, Integer b) {
   Integer temp = a;
   a = b;
   b = temp;
   }


✔ Compiles
❌ Does nothing

Null unboxing
Integer n = null;
int x = n; // NPE

Reference confusion
List<String> list = new ArrayList<>();
modify(list);

void modify(List<String> l) {
l.add("A"); // visible
l = new ArrayList<>(); // not visible
}

9. Interview One-Liners (Memorize)

Java is always pass-by-value

Object references are copied, not objects

== compares identity, .equals() compares value

Wrapper caching applies to -128 to 127

Avoid wrappers in performance-critical code

Immutability prevents side effects

final fixes the reference, not the object

Unboxing null causes NPE

10. Why This Section Matters for Seniors

These concepts explain:

Unexpected bugs

Performance regressions

Concurrency behavior

OCP exam traps

Subtle interview questions used by FAANG-level companies

You are expected to explain these clearly, not just code them.