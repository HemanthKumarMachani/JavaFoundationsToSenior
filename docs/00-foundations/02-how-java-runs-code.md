# 02 – How Java Runs Your Code

This answers: **“What happens when I run `java MyMainClass`?”**

## 1. From .java to .class

1. Write `MyMainClass.java`
2. Compile with `javac MyMainClass.java`
    - The compiler checks syntax and types
    - Produces `MyMainClass.class` (bytecode)

Bytecode is **platform-independent**. The same `.class` can run on Windows, Linux, macOS, etc., as long as there is a compatible JVM.

---

## 2. From .class to running program

When you run:

```bash
java MyMainClass