# Arrays & Memory Layout (Java 8–25)

---

## 1. What is an Array in Java?

- An array is an **object**
- Stored on the **heap**
- Fixed size once created
- Can store primitives or references
- Indexed (zero-based)

```java
int[] nums = new int[5];
```

## 2. Primitive Arrays vs Reference Arrays

## Primitive array
```java
int[] nums = {1,2,3};
```
- Stores actual values
- No null values
- faster access

## Reference array
```java
String[] names = new String[5];
```
- Stores references to objects
- Elements default to null
- Each element may point to a different object
## 3. Array Memory Layout

> Important facts:
- Array reference lives on stack
- Array object lives on heap
- Primitive values are inside the array object
- Reference arrays store object references

Visualization:
```code
Stack ──► reference ──► Heap Array Object
```
## 4. Default Values in Arrays

| Type    | Default Value                  |
|---------|--------------------------------|
| int     | 0                              |
| double  | 0.00                           |
| Object  | null                           |
| boolean | false                          |
| String  | "" (empty String)/null         |
| char    | '' (Space Character) '\u0000' (null character) |
## 5. Arrays are Passed by Value (Reference Copy)

- Arrays follow Java pass-by-value rules. 
```java
void modify(int[] arr) {
arr[0] = 99;
}
```
- Caller sees change (same object)
```java
void reassign(int[] arr) {
    arr = new int[]{1,2,3};
}
```
- Caller not affected

## 6. Common Array Interview Traps

- Off-by-one error
```java
for (int i = 0; i <= arr.length; i++) { } // ❌
```
- Correct
```java
for (int i = 0; i < arr.length; i++) { } // ✔
```
## ArrayIndexOutOfBoundsException
- Happens at runtime
- piler does NOT catch it
## 7. Multidimensional Arrays (Jagged Arrays)

- Java does NOT have true 2D arrays.
```java
int[][] matrix = new int[3][];
```
- Each row is a separate array:
  -	Different lengths allowed
  - Memory not contiguous

