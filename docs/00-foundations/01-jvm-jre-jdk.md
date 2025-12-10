# 01 - JVM, JRE, JDK

## 1. Terminology

### JDK (Java Development Kit)

- What you install as a **developer**
- Contains:
    - `javac` (compiler)
    - `java` (launcher)
    - Tools (`jlink`, `jpackage`, `javadoc`, etc.)
    - The JRE

> Interview: “To develop and compile Java code, you need the JDK, not just the JRE.”

---

### JRE (Java Runtime Environment)

- What you need to **run** Java programs
- Contains:
    - JVM
    - Core class libraries (`java.lang`, `java.util`, etc.)

In modern distributions, the JRE is often not shipped as a standalone thing. You typically install the JDK, and it includes a runtime.

---

### JVM (Java Virtual Machine)

- The **engine** that executes Java bytecode
- Responsibilities:
    - Load `.class` files (class loader)
    - Verify bytecode (safety checks)
    - Execute code (interpreter + JIT)
    - Manage memory (heap, stack, GC)

> Interview phrase:
> “My code doesn’t run directly on the OS. It’s compiled to bytecode, and the JVM runs that bytecode.”

---

## 2. How they fit together

- You write `MyClass.java` → **source code**
- `javac` (from JDK) compiles it to `MyClass.class` → **bytecode**
- `java` launches the **JVM**, which:
    - Uses class loaders to load `MyClass`
    - Verifies bytecode
    - Executes it

In one line:

> JDK = tools + JRE, JRE = JVM + libraries.

---

## 3. Modern context (Java 8 → 25)

Key points worth mentioning in interviews:

- Java 8 made functional programming mainstream (lambdas, streams)
- Java 9 introduced the **module system** and a more modular JDK
- Java 11 & 17 (LTS versions) became standard in many companies
- Java 21 & 25 focus heavily on:
    - **Virtual threads (Project Loom)** for massive concurrency
    - Better GCs (ZGC, Shenandoah, Generational ZGC)
    - Performance and startup improvements

You don’t need to list every version. It’s enough to say:

> “I work with Java 17/21 LTS. I understand the modular JDK, the impact of G1/ZGC on latency, and new features like records and virtual threads.”