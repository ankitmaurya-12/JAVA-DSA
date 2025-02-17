Timestamps:
0:00 Introduction 
1:58 Problem Statement
5:31 Methods
5:41 Syntax of a Method
6:40 🎯 Program : Sum of two numbers
9:11 🎯 Program : Greetings
11:18 Returning Values
14:31 Returning a String
17:42 Parameters (Integer Function)
20:36 Parameters (String Function)
25:03 🎯 Program : Swap two numbers
25:25 🎯 Program : Pass Value
29:39 Internal Working of Swapping Program
41:33 🎯 Program : Change Value
46:41 Scope
47:00 Method Scope
49:46 Block Scope
55:32 Loop Scope
59:44 Shadowing
1:06:53 Variable Arguments (Varargs)
1:12:07 Method Overloading
1:19:25 🎯 Questions
1:20:01 Q1 : Prime Number
1:23:52 Q2 : Check Armstrong Number
1:28:27 Q3 : Print All 3 Digit Armstrong Numbers
1:30:18 Outro





### Problem : Swap two numbers[]: # Path: 1.%20Functions/Functions.MD

Swap.java
```Java
import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      System.out.println("Enter Value of A :");
      int A = input.nextInt();

      System.out.println("Enter Value of B :");
      int B = input.nextInt();

      System.out.println("Before Swapping A = " + A + " and B = " + B);
      
      swap(A, B);
    }
    
    static void swap(int A, int B){
      int temp = A;
      A = B;
      B = temp;
      System.out.println("After Swapping A = " + A + " and B = " + B);
    }
}
```

Output:
```bash
Enter Value of A :
10
Enter Value of B :
20
Before Swapping A = 10 and B = 20
After Swapping A = 20 and B = 10
```

### Problem : Pass By Value[]: # Path: 1.%20Functions/Functions.
PassValue.java
```Java
import java.util.Scanner;

public class PassValue {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      System.out.println("Enter Value of A :");
      int A = input.nextInt();

      System.out.println("Enter Value of B :");
      int B = input.nextInt();

      System.out.println("Before Swapping A = " + A + " and B = " + B);
      
      swap(A, B);
      
      System.out.println("After Swapping A = " + A + " and B = " + B);
    }
    
    static void swap(int A, int B){
      int temp = A;
      A = B;
      B = temp;
      System.out.println("After Swapping A = " + A + " and B = " + B);
    }
}
```

Output:
```bash
Enter Value of A :
10
Enter Value of B :
20
Before Swapping A = 10 and B = 20
After Swapping A = 20 and B = 10
After Swapping A = 10 and B = 20
```

// Here we are passing the value of A and B to the swap method. But the value of A and B is not changing. Because we are passing the value of A and B not the reference of A and B. So, the value of A and B is not changing.
// In Java, we can pass the value of the variable to the method. We can not pass the reference of the variable to the method. So, the value of the variable is not changing.
// In Java, we can pass the reference of the object to the method. So, the value of the object is changing.
// In Java, we can pass the reference of the array to the method. So, the value of the array is changing.

Solution of this problem is Pass By Reference.

### Problem : Change Value[]: # Path: 1.%20Functions/Functions.MD

ChangeValue.java
```Java
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      System.out.println("Enter Value of A :");
      int A = input.nextInt();

      System.out.println("Enter Value of B :");
      int B = input.nextInt();

      System.out.println("Before Swapping A = " + A + " and B = " + B);
      
      int[] arr = {A, B};
      swap(arr);
      
      System.out.println("After Swapping A = " + arr[0] + " and B = " + arr[1]);
    }
    
    static void swap(int[] arr){
      int temp = arr[0];
      arr[0] = arr[1];
      arr[1] = temp;
      System.out.println("After Swapping A = " + arr[0] + " and B = " + arr[1]);
    }
}
```

Output:
```bash
Enter Value of A :
10
Enter Value of B :
20
Before Swapping A = 10 and B = 20
After Swapping A = 20 and B = 10
After Swapping A = 20 and B = 10
```




### Scope[]: # Path: 1.%20Functions/Functions.MD

- Scope is the lifetime of the variable.
- Scope is the visibility of the variable.
- Scope is the range of the variable.
- Scope is the duration of the variable.
- Scope is the accessibility of the variable.
- Scope is the availability of the variable.
- Scope is the existence of the variable.
- Scope is the validity of the variable.
- Scope is the area of the variable.
- Scope is the region of the variable.


Types of Scope:

- Method Scope
- Block Scope
- Loop Scope
- Class Scope
- Object Scope
- Static Scope
- Instance Scope
- Local Scope
- Global Scope
- Member Scope
- Function Scope
- Variable Scope
- Parameter Scope
- Constant Scope
- Array Scope
- String Scope
 
