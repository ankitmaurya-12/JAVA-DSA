In Java, data types are categorized as either primitive or non-primitive.

Primitive Data Types:

These are the most basic data types in Java and represent single values.
They are predefined by the language and are stored directly in memory.

There are 8 primitive data types in Java:

byte: Stores whole numbers from -128 to 127. Takes up 1 byte of memory.
short: Stores whole numbers from -32,768 to 32,767. Takes up 2 bytes of memory.
int: Stores whole numbers from -2,147,483,648 to 2,147,483,647. Takes up 4 bytes of memory.
long: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Takes up 8 bytes of memory.
float: Stores single-precision floating-point numbers. Takes up 4 bytes of memory.
double: Stores double-precision floating-point numbers. Takes up 8 bytes of memory.
char: Stores a single character. Takes up 2 bytes of memory.
boolean: Stores true or false values. Takes up 1 bit of memory.

Non-Primitive Data Types:

Also known as reference types, these data types are not predefined by the language.
They are created by the programmer and store references to objects in memory.
Some common examples of non-primitive data types are:

String: Represents a sequence of characters.
Arrays: Used to store a collection of elements of the same type.
Classes: User-defined blueprints for creating objects.
Interfaces: Contracts that define a set of methods that a class must implement.

Key Differences:
Memory Allocation: Primitive types store values directly in memory, while non-primitive types store references to memory locations where the object is stored.
Null Values: Primitive types cannot be null, while non-primitive types can be null.
Mutability: Primitive types are immutable, meaning their values cannot be changed once assigned. Non-primitive types are mutable, meaning their values can be modified.

Example:

int age = 30; // Primitive data type
String name = "John"; // Non-primitive data type