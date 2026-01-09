Strings, Immutability & String Pool (Java 8–25)

Why this topic matters
•	Strings are used everywhere: logs, APIs, JSON, DB queries
•	Poor String handling causes:
•	Performance issues
•	Memory leaks
•	GC pressure
•	Interviewers use Strings to test:
•	JVM knowledge
•	Memory understanding
•	Attention to detail

1. What is a String in Java?

• String is a reference type

• String is immutable

• Once created, its value cannot change

• Any modification creates a new String object

String s = "Hello";
s.concat(" World");
System.out.println(s); // Hello

2. Why is String immutable?
   Core reasons (interview-ready)

> Security

Strings are used in:

Class loading

File paths

Database URLs

If mutable, attackers could change values at runtime

> Thread safety

Immutable objects are inherently thread-safe

String Pool optimization

Same String instance can be shared safely

Hash-based collections

String immutability ensures stable hashCode()

Senior one-liner:

> String is immutable to ensure security, thread safety, and memory optimization via the String Pool.

3. String Pool (Critical Interview Topic)
   What is the String Pool?

A special memory area in the heap

Stores unique String literals

Managed by the JVM

String a = "Java";
String b = "Java";
System.out.println(a == b); // true


Both references point to the same pooled object.

Heap vs Pool creation
String s1 = "Java";              // pooled
String s2 = new String("Java");  // new object in heap

System.out.println(s1 == s2);        // false
System.out.println(s1.equals(s2));   // true

4. String Interning
   What is intern()?

Explicitly adds a String to the String Pool

Returns pooled reference

String s1 = new String("Java");
String s2 = s1.intern();

String s3 = "Java";

System.out.println(s2 == s3); // true

When to use intern()

✔ Memory optimization when many duplicate Strings
❌ Avoid excessive use (can cause memory pressure)

5. == vs .equals() with Strings
   Comparison	Meaning
   ==	Reference equality
   .equals()	Value equality
   String a = "Hello";
   String b = new String("Hello");

a == b        // false
a.equals(b)  // true


Interview trap:
If both Strings come from the pool, == may return true.

6. String Concatenation (+) Internals
   Compile-time optimization
   String s = "Hello" + " World";


Compiler optimizes to:

String s = "Hello World";


No extra objects created.

Runtime concatenation (danger)
String result = "";
for (int i = 0; i < 1000; i++) {
result += i;
}


❌ Creates 1000+ temporary String objects

7. StringBuilder vs StringBuffer vs String
   Type	Mutable	Thread-safe	Use case
   String	❌	✔	Constants, config
   StringBuilder	✔	❌	Fast, single-thread
   StringBuffer	✔	✔	Legacy, synchronized

Rule:

Use StringBuilder in loops, never String.

8. Modern JVM Optimizations (Java 9+)

Compact Strings:

Uses byte[] instead of char[] when possible

Reduced memory footprint

Same API, better efficiency

You don’t need to code this, but mention it in senior interviews.

9. Tricky Interview Questions & Scenarios
   ❓ Why is this false?
   String a = "Java";
   String b = new String("Java");
   System.out.println(a == b); // false


✔ Different memory locations
✔ Pool vs heap

❓ How many objects created?
String s = "A" + "B" + "C";


✔ 1 object (compile-time optimization)

❓ How many objects created?
String s = "A";
s = s + "B";


✔ 2 objects ("A", "AB")

❓ Is this thread-safe?
StringBuilder sb = new StringBuilder();


✔ Not thread-safe
✔ Use only within single-thread context

10. Common Mistakes (Red Flags in Interviews)

❌ Using == for String comparison
❌ Using String in loops
❌ Ignoring immutability effects
❌ Excessive use of intern()
❌ Assuming StringBuffer is needed in modern code

11. Interview One-Liners (Memorize)

Strings are immutable for safety and performance

String Pool allows reuse of literals

== compares references, .equals() compares values

Use StringBuilder in loops

intern() returns pooled reference

JVM optimizes String storage internally (Compact Strings)