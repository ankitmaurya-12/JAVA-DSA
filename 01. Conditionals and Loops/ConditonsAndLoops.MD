# Conditions and Loops :-

### Conditions :

What are Conditions ?
Conditions are used to perform different actions based on different conditions.

Eg. 

```
Suppose you have print the grade of a student based on the marks obtained by the student.
```

```java

if(marks > 90){
    System.out.println("Grade A");
}else if(marks > 80){
    System.out.println("Grade B");
}else if(marks > 70){
        System.out.println("Grade C");
}

```

### Types of Conditions :

1. If

We use If condition to perform some action based on a condition.

Syntax :

```java

if(condition){
    // code to be executed
}

```

2. If-Else

We use If-Else condition to perform some action based on a condition.

Syntax :

```java

if(condition){
    // code to be executed
}else{
    // code to be executed
}

```


3. If-Else-If

We use If-Else-If condition to perform some action based on a condition.

Syntax :

```java

if(condition){
    // code to be executed
}else if(condition){
    // code to be executed
}else{
    // code to be executed
}

```

4. Nested If-Else

We use Nested If-Else condition to perform some action based on a condition.

Syntax :

```java

if(condition){
    // code to be executed
}else{
    if(condition){
        // code to be executed
    }else{
        // code to be executed
    }
}

```

5. Switch-Case

We use Switch-Case condition to perform some action based on a condition.

Syntax :

```java

switch(expression){
    case value1:
        // code to be executed
        break;
    case value2:
        // code to be executed
        break;
    default:
        // code to be executed
}

```

6. Ternary Operator

We use Ternary Operator to perform some action based on a condition.

Syntax :

```java

variable = (condition) ? expressionTrue : expressionFalse;

```

### Loops : 

What are Loops ?

Loops are used to execute a set of statements multiple times.

Eg. 

```
Problem : Suppose you have to print numbers from 1 to 10.
```


```java
//We can't write System.out.println(1);
//System.out.println(2);
//System.out.println(3);
//...
//System.out.println(10);

//Instead we can use loops to do this.
for(int num = 1; num <= 10; num++){
    System.out.println(i);
}

```

Problem : Print numbers from 1 to n.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

Problem : Print numbers from n to 1.

```java
import java.util.Scanner;

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
```

Problem : Print even numbers from 1 to n.

```java
import java.util.Scanner;

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = 1; num <= n; num++) {
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
```


Problem : Print odd numbers from 1 to n.

```java

import java.util.Scanner;

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = 1; num <= n; num++) {
            if(num % 2 != 0){
                System.out.println(num);
            }
        }
    }
}
```

Problem : Print numbers from 1 to n in reverse order.

```java

import java.util.Scanner;

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
```

Problem : Print numbers from n to 1 in reverse order.

```java

import java.util.Scanner;

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
```

Problem : Print numbers from 1 to n in reverse order.

```java

import java.util.Scanner;   

public class Main(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
```



### Types of Loops :

1. For Loop

We use For Loop to execute a set of statements multiple times.

Syntax :

```java

for(initialization; condition; increment/decrement){
    // code to be executed
}

```

When to use For loop is
- When we know the number of iterations.
- When we want to execute the loop based on the condition.
- When we want to execute the loop multiple times.
- When we want to execute the loop based on the user input.

2. While Loop

We use While Loop to execute a set of statements multiple times.

Syntax :

```java

while(condition){
    // code to be executed
}

```

Problem : Print numbers from 1 to 10.

```java

int i = 1;
while(i <= 10){
    System.out.println(i);
    i++;
}

```

When to use While loop is
- When we want to execute the loop based on the user input.
- When we want to execute the loop based on the condition.
- When we want to execute the loop multiple times.


3. Do-While Loop

We use Do-While Loop to execute a set of statements multiple times.

Syntax :

```java

do{
    // code to be executed
}while(condition);

```
When to use Do-While loop is
- When we want to execute the loop at least once.
- When we want to execute the loop multiple times.
- When we want to execute the loop based on the condition.
- When we want to execute the loop based on the user input.


4. For-Each Loop

We use For-Each Loop to iterate through the elements of an array.

Syntax :

```java

for(dataType variableName : arrayName){
    // code to be executed
}

```

Problem : Print elements of an array.

```java

int[] arr = {1, 2, 3, 4, 5};

for(int i : arr){
    System.out.println(i);
}

```

When to use For-Each loop is
- When we want to iterate through the elements of an array.
- When we want to iterate through the elements of a collection.
- When we want to iterate through the elements of a list.
- When we want to iterate through the elements of a set.
- When we want to iterate through the elements of a map.


5. Infinite Loop

We use Infinite Loop to execute a set of statements infinitely.
- It is not recommended to use Infinite Loop.
- We can use break statement to exit the loop.
- We can use continue statement to skip the current iteration.
- We can use return statement to exit the loop.
- We can use System.exit(0) to exit the loop.
- We can use exit(0) to exit the loop.

Syntax :

```java

while(true){
    // code to be executed
}

```

6. Nested Loop

We use Nested Loop to execute a set of statements multiple times.
- We can use break statement to exit the loop.
- We can use continue statement to skip the current iteration.
- We can use return statement to exit the loop.
- We can use System.exit(0) to exit the loop.
- We can use exit(0) to exit the loop.

Syntax :

```java

for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 3; j++){
        // code to be executed
    }
}

```


---------------------------------------------------------------------------------------------------------
### Problems :

1. Find the largest Number.

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //using method 1 : using if-else
        max1(a,b,c);
        
        //using method 1a : using if-else
        max1a(a,b,c);
        
        //using method 2 : using ternary operator
        max2(a,b,c);
        
        //using method 3 : using Math.max()
        max3(a,b,c);
        
        
    }
    
    static void max1(){
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    
    static void max1a(){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);
    }
    
    static void max2(){
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
    
    static void max3(){
        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);
    }
    
}


```

2. Find the smallest Number.

```java

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //using method 1 : using if-else
        min1(a, b, c);

        //using method 1a : using if-else
        min1a(a, b, c);

        //using method 2 : using ternary operator
        min2(a, b, c);

        //using method 3 : using Math.min()
        min3(a, b, c);
    }
    
    static void min1(){
        if (a < b && a < c){
            System.out.println("Smallest Number : " + a);
        } else if (b< a & b<c) {
            System.out.println("Smallest Number : " + b);
        }else {
            System.out.println("Smallest Number : " + c);
        }
        }
    }
    
    static void min1a(){
        int min = a;
        if (b<min) {
            min = b;
        }
        if (c < min){
            min = c;
        }
        System.out.println(min);
    }
    
    static void min2() {
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(min);
    }
    
    static void min3() {
        int min = Math.min(a, Math.min(b, c));
        System.out.println(min);
    }
}

```

3. Check weather a alphabet is lowercase or UpperCase.

```java
import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        System.out.println("You Entered : " + ch);

        typeCheck(ch);
    }

    static void typeCheck(char ch){
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("It's a Lower Case.");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("It's a Upper Case.");
        } else {
            System.out.println("It's not an Alphabet.");
        }
    }
}

```

Problem 3: Fibonacci Numbers:

```java

public class Fib(){
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        
        int count = 2;
        
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);
}

```


Problem : find the number of occurence 

```java

```

Probelm : find the number of digits in a number.

```java

```

### Loop Control Statements :

1. Break
2. Continue
3. Return
4. System.exit(0)
5. exit(0)
6. Labelled Break
7. Labelled Continue
8. Labelled Return
9. Labelled System.exit(0)
10. Labelled exit(0)
11. Labelled Loop
12. Labelled While Loop
13. Labelled Do-While Loop
14. Labelled For Loop
15. Labelled For-Each Loop

### Loop Control Statements :

1. Break

We use Break statement to exit the loop.
- It is used to terminate the loop.
- It is used to exit the loop.
- It is used to exit the switch statement.
- It is used to exit the innermost loop.
- It is used to exit the innermost switch statement.

Syntax :

```java

for(int i = 1; i <= 10; i++){
    if(i == 5){
        break;
    }
}

```

2. Continue

We use Continue statement to skip the current iteration.
- It is used to skip the current iteration.
- It is used to skip the current loop.
- It is used to skip the current switch statement.
- It is used to skip the innermost loop.

Syntax :

```java

for(int i = 1; i <= 10; i++){
    if(i == 5){
        continue;
    }
}

```

3. Return

We use Return statement to exit the loop.
- It is used to exit the loop.
- It is used to exit the method.
- It is used to exit the switch statement.
- It is used to exit the innermost loop.

Syntax :

```java

for(int i = 1; i <= 10; i++){
    if(i == 5){
        return;
    }
}

```

4. System.exit(0)

We use System.exit(0) statement to exit the loop.
- It is used to exit the loop.
- It is used to exit the program.
- It is used to exit the switch statement.
- It is used to exit the innermost loop.

Syntax :

```java

for(int i = 1; i <= 10; i++){
    if(i == 5){
        System.exit(0);
    }
}

```

5. exit(0)

We use exit(0) statement to exit the loop.
- It is used to exit the loop.
- It is used to exit the program.
- It is used to exit the switch statement.
- It is used to exit the innermost loop.

Syntax :

```java

for(int i = 1; i <= 10; i++){
    if(i == 5){
        exit(0);
    }
}

```

6. Labelled Break

We use Labelled Break statement to exit the loop.
- It is used to terminate the loop.
- It is used to exit the loop.
- It is used to exit the switch statement.

Syntax :

```java

label1:
for(int i = 1; i <= 10; i++){
    label2:
    for(int j = 1; j <= 10; j++){
        if(j == 5){
            break label1;
        }
    }
}

```


7. Labelled Continue

We use Labelled Continue statement to skip the current iteration.
- It is used to skip the current iteration.
- It is used to skip the current loop.

Syntax :

```java

label1:
for(int i = 1; i <= 10; i++){
    label2:
    for(int j = 1; j <= 10; j++){
        if(j == 5){
            continue label1;
        }
    }
}

```

like this others....


