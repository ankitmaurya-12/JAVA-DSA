### Every file in Java is Class. 

Eg: 
Main.java
```Java
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

- public: Access modifier                   -> Can be access from Anywhere
- class:                                     -> Name group of properties and methods
- Main: Name of the class                    -> Name of the file should be same as class name
- Method: Function                          -> Function inside a class known as Methods && And Functions are block of code to perform a specific task 
- main: Method                               -> to run the program main method is required if not then program will not run
- static: Keyword                            -> No need to create object to call the method (means "We not want to create class of Main". Since Every Class have the Object)
- void: Return type                          -> Return type of the method
- String[] args: Command line arguments     -> Arguments passed to the program (What we pass in the command line)
- System.out.println: Print statement       -> Print the message
- ;: End of statement
- {}: Block of code

Note: "If Class first letter is capital then file name should be same as class name. Its called Java Class."


_______________
Some Important Points about Java:

- Java is case sensitive
- Java is platform independent
- Java is Object Oriented
- Java is simple
- Java is secure
- Java is portable
- Java is robust
- Java is multithreaded
- Java is interpreted
- Java is high performance
- Java is distributed
- Java is dynamic
- Java is architecture neutral
_______________



### How to run Java Program:
- Save the file with .java extension
- Open the terminal
- Go to the directory where the file is saved
- Compile the file using javac filename.java
- Run the file using java filename
- Eg: 
```Java
javac Main.java
java Main
```

____________________
javac, java, git, python, python3 ... are the commands which are used to run the program. These are the commands which are installed in the system.

We can find the path of the command using which command. 
```bash
where javac
```

All the command is stored here /usr/bin/ directory. We can find the path of the command using which command. 
_____________________


## Shortcuts:
- To run the program: 
    - ctrl + ` (backtick) -> Open the terminal
    - javac filename.java -> Compile the file
    - java filename -> Run the file
    - cls -> Clear the terminal
    - exit -> Close the terminal
    - ctrl + c -> Close the terminal

- For Java :
    - psvm -> public static void main(String[] args)
    - sout -> System.out.println()
    - soutv -> System.out.println("variable = " + variable)
    - fori -> for loop
    - iter -> for each loop
    - ifn -> if (variable == null)
    - inn -> if (variable != null)
    - prsf -> private static final
    - 

- For Idea:
    - ctrl + shift + a -> Search anything
    - ctrl + e -> Recent files
    - ctrl + shift + e -> Recent edited files
    - ctrl + shift + f -> Find in path
    - ctrl + shift + r -> Replace in path
    - ctrl + shift + n -> Search file
    - ctrl + shift + alt + n -> Search class
    - ctrl + shift + alt + t -> Surround with
    - ctrl + alt + l -> Reformat code
    - ctrl + alt + o -> Optimize imports
    - ctrl + alt + i -> Auto indent
    - ctrl + alt + t -> Refactor this
    - ctrl + alt + v -> Introduce variable
    - ctrl + alt + m -> Extract method
    - ctrl + alt + c -> Extract constant
    - ctrl + alt + p -> Extract parameter
    - ctrl + alt + f -> Extract field
    - ctrl + alt + l -> Extract local variable
    - ctrl + alt + n -> Inline
    - ctrl + alt + o -> Override method
    - ctrl + alt + i -> Implement method


### 1.1. Package[]: # Path: 0.%20First%20Program/Readme.MD

What is package in Java?
- Package is a collection of related classes and interfaces.
- Package is used to categorize the classes and interfaces so that they can be easily maintained.
- Package provides access protection.
Eg.
```Java
package com.kunal;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
and another file is
```Java
package com.ankit;
public class Main2{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
here com is the package name and kunal and ankit are the subpackage name.


There are some predefined packages in Java:

- java.lang
- java.util
- java.io
- java.awt
- java.net


### 1.2. Java Program Structure[]: # Path: 0.%20First%20Program/Readme.MD
- Package Declaration
- Import Statements
- Class Declaration
- Main Method
- Variables
- Statements
- Comments
- White Spaces
- Case Sensitivity
- Semicolons
- Blocks of Code
- Keywords
- Identifiers
- Literals
- Operators
- Expressions


### How to take input in Java[]: # Path: 0.%20First%20Program/Readme.MD

- Scanner class is used to take input in Java.
- Scanner class is present in java.util package.
- We need to import the Scanner class to use it.
- We can take input of different data types using Scanner class.
- We can take input from the user using Scanner class.
- We can take input from the file using Scanner class.
- We can take input from the console using Scanner class.
- We can take input from the keyboard using Scanner class.
- We can take input from the command line using Scanner class.

```Java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Number is: " + number);
    }
}
```

Output :
 ```bash
Enter the number:
10
Number is: 10
 ```

### How to take input from the command line in Java[]: # Path: 0.%20First%20Program/Readme.MD

- We can take input from the command line using args array.
- args array is present in the main method.
- args array is used to take input from the command line.
- args array is used to pass arguments to the program.
- args array is used to pass values to the program.
- args array is used to pass data to the program.
- args array is used to pass values to the main method.
- args array is used to pass data to the main method.
- args array is used to pass values to the main method.
- args array is used to pass data to the

```Java
public class Main{
    public static void main(String[] args){
        System.out.println("Number is: " + args[0]);
    }
}
```

Output:
```bash
Number is: 10
```

## Primitive Data Types[]: # Path: 0.%20First%20Program/Readme.MD
(Any Data type that can't be break down further)

- Primitive data types are the basic data types in Java.
- Primitive data types are predefined by the language and named by a keyword.
- Primitive data types are used to store single values.
- Primitive data types are used to store single characters.
- Primitive data types are used to store single numbers.
- Primitive data types are used to store single boolean values.
- Primitive data types are used to store single true or false values.
- Primitive data types are used to store single bits.

Types of Primitive Data Types:

```java
int number = 10; // 4 bytes
char ch = 'A'; // 2 bytes
float marks = 95.64f; // 4 bytes
double largeDecimalNumber = 14649890.565515; // 8 bytes
long largeInteger = 7415963258715684230L; // 8 bytes
short num = 10; // 2 bytes
boolean check = true; // 1 bit

// Wrapper Class - Allow me to add more functionality to the primitive data types
Integer number = 10; // 4 bytes (Wrapper Class)
Character ch = 'A'; // 2 bytes (Wrapper Class)
Float marks = 95.64f; // 4 bytes (Wrapper Class)
Double largeDecimalNumber = 14649890.565515; // 8 bytes (Wrapper Class)
Long largeInteger = 7415963258715684230L; // 8 bytes (Wrapper Class)
Short num = 10; // 2 bytes (Wrapper Class)
Boolean check = true; // 1 bit (Wrapper Class)

// byte 
byte b = 10; // 1 byte

```


Q. Why adding f in float and L in long?
- By default, Java treats all floating-point numbers as doubles. So, if we want to treat a floating-point number as a float, we need to add f at the end of the number.
- By default, Java treats all integer numbers as integers. So, if we want to treat an integer number as a long, we need to add L at the end of the number.
- By default, Java treats all decimal numbers as doubles. So, if we want to treat a decimal number as a double, we need to add d at the end of the number.


### 1.3. Input and Output[]: # Path: 0.%20First%20Program/Readme.MD

- System.out.println() is used to print the message.
- System.out.print() is used to print the message.
- System.out.printf() is used to print the message.
- System.out.format() is used to print the message.
- 
- System.in is used to take input from the user.
- System.err is used to print the error message.
- System.out is used to print the message.

```Java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Roll Number: ");
        int Roll_number = input.nextInt();
        System.out.println("Your Roll Number is: " + Roll_number);
    }
}
```

System.in

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Roll Number: ");
      
      int Roll_number = input.nextInt();
      //input.nextLine(); // To clear the buffer          //it will take the next line
      //input.next(); // To clear the buffer               // it will take the next word
      //input.nextFloat(); // To clear the buffer         // it will take the next float
      //input.nextDouble(); // To clear the buffer         // it will take the next double
      
        System.out.println("Your Roll Number is: " + Roll_number);
    }
} 
```

### Literals and Identifiers[]: # Path: 0.%20First%20Program/Readme.MD

- Literals are the constant values that are assigned to the variables.
- Literals are the fixed values that are assigned to the variables.
- Literals are the values that are assigned to the variables.

Types of Literals:

- Integer Literals
- Floating Point Literals
- Character Literals
- String Literals
- Boolean Literals
- Null Literals

```Java
int number = 10; // Integer Literals                //Here literal is 10
float marks = 95.64f; // Floating Point Literals    //Here literal is 95.64
char ch = 'A'; // Character Literals                //Here literal is 'A'
String name = "Kunal"; // String Literals           //Here literal is "Kunal"
boolean check = true; // Boolean Literals           //Here literal is true
String str = null; // Null Literals                 //Here literal is null
```

Interesting Points about Literals:

```java
int a = 234_00_000; // 23400000             //We can use underscore to separate the digits
int b = 0b1010; // 10                       //Binary Literals
int c = 0x2A; //                            //Hexadecimal Literals
int d = 012; // 10                          //Octal Literals   
int e = 0b1010_1010; // 170                 //Binary Literals
int f = 0x2A_2A; // 10794                   //Hexadecimal Literals
int g = 012_34; // 668                      //Octal Literals
int h = 0b1010_1010_1010_1010; // 43690     //Binary Literals

float i = 95.64f; // 95.64                  //Floating Point Literals
float j = 95.64F; // 95.64                  //Floating Point Literals
float k = 9.564e1; // 95.64                 //Floating Point Literals
float l = 9.564E1; // 95.64                 //Floating Point Literals
float m = 0.9564e2; // 95.64                //Floating Point Literals
float n = 0.9564E2; // 95.64                //Floating Point Literals
float o = 95.64e0; // 95.64                 //Floating Point Literals
float p = 95.64E0; // 95.64                 //Floating Point Literals
float q = 0.9564e2f; // 95.64               //Floating Point Literals
float r = 0.9564E2F; // 95.64               //Floating Point Literals
float s = 95.64e0f; // 95.64                //Floating Point Literals
```

- Identifiers are the names given to the variables, methods, classes, etc.

Rules for Identifiers:

- Identifiers can have alphanumeric characters and underscore.
- Identifiers should start with an alphabet or underscore.
- Identifiers are case sensitive.
- Identifiers should not be a keyword.
- Identifiers should not have any special characters.
- Identifiers should not have any white spaces.
- Identifiers should not have any digits.
- Identifiers should not have any reserved words.
- Identifiers should not have any operators.

```Java
int number = 10; // number is the identifier
float marks = 95.64f; // marks is the identifier
char ch = 'A'; // ch is the identifier
```

### Problem : Sum of two numbers[]: # Path: 1.%20Functions/Functions.MD

Sum.java
```Java
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        int a = in.nextInt();

        System.out.println("Enter the Second Number :");
        int b = in.nextInt();

        System.out.println("Sum of two number is :" + (a + b));
    }
}
```

Output:
```bash
Enter the First Number :  
10
Enter the Second Number :
20
Sum of two number is : 30
```

### Problem : Greetings[]: # Path: 1.%20Functions/Functions.MD

Greetings.java
```Java
import java.util.Scanner;

public class Greetings{
  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Hello !!" + name + "Hope you are doing well.");
  }
}

```

Output:
```bash
Enter your name:
Ankit
Hello !! Ankit Hope you are doing well.
```


### Type Conversion and Type Casting[]: # Path: 1.%20Functions/Functions.MD
(When one type of data is assigned to another type of Variable and automatically converted by the compiler)

- Type Conversion is the process of converting the data from one data type to another data type.
- Type Conversion is the process of converting the data from one form to another form.
- Type Conversion is the process of converting the data from one format to another format.
- Type Conversion is the process of converting the data from one style to another style.
- Type Conversion is the process of converting the data from one structure to another structure.
- Type Conversion is the process of converting the data from one representation to another representation.
- Type Conversion is the process of converting the data from one category to another category.
- Type Conversion is the process of converting the data from one kind to another kind.
- Type Conversion is the process of converting the data from one class to another class.
- Type Conversion is the process of converting the data from one object to another object.
- Type Conversion is the process of converting the data from one value to another value.

Eg:
```Java
int number = 10;
float marks = number; // Implicit Type Conversion
```

Types of Type Conversion:

- Implicit Type Conversion
- Explicit Type Conversion
- Automatic Type Conversion

Eg. Implicit Type Conversion :
```Java
int number = 10;
float marks = number; // Implicit Type Conversion
```

Eg. Explicit type Conversion:
```Java
float marks = 95.64f;
int number = (int)marks; // Explicit Type Conversion
```

Eg. Automatic Type Conversion:
```Java
int number = 10;    
float marks = 95.64f;
int sum = number + marks; // Automatic Type Conversion
```

Eg. Byte
```Java
int a = 257;
byte b = (byte)a; // 257 % 256 = 1
```

Another example of Automatic Type Conversion:
```Java
byte a =40;
byte b = 50;
byte c = 100;
int d = a * b / c;
System.out.println(d); // 20
```

Another example of Automatic Type Conversion:


For String to Integer:

```Java
String str = "10";
int number = Integer.parseInt(str);
System.out.println(number);
```

```Java
int numer = 'A';
System.out.println(number); // 65
```

Type Casting :

There are two conditions for type casting:
- The data type should be compatible.
- The target data type should be larger than the source data type.

```Java
float marks = 95.64f;
int number = (int)marks; // Explicit Type Conversion
```

Rule for Type Promotion :
- If one of the operands is double, the other is promoted to double.
- If one of the operands is float, the other is promoted to float.
- If one of the operands is long, the other is promoted to long.
- If one of the operands is int, the other is promoted to int.

```Java
    int a = 10;
    float b = 20.5f;
    int c = a * b; // Error

    int a = 10;
    float b = 20.5f;
    float c = a * b; // No Error

```


Lets learn all by example:

```Java
byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = .1234;
double result = (f * b) + (i / c) - (d * s);
// float + int -double  = double
System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
System.out.println(result);

```



Note:
- In Java, the char data type supports the Unicode characters.
- In Java, the char data type supports the ASCII characters.
- In Java, the char data type supports the UTF-8 characters.

UNICODE Example:
```Java
System.out.println("नमस्ते")  // It will print the Hindi text (नमस्ते)
```





