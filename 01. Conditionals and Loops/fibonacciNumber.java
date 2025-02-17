import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //        int n = 10;

        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        // Method 1: using while loop
        System.out.print("\nFibonacci Series (while loop): ");
        fib1(n, a, b);

        //Method 2: using for loop -> This is the most efficient method for generating Fibonacci numbers.
        System.out.print("\nFibonacci Series (for loop): ");
        fib2(n, a, b);

        //Method 3: using recursion
        System.out.print("\nFibonacci Series (recursion): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }


        //Method 4: Using recursion with memoization

        //Method 5 : Using Java Streams (Java 8+)

        //Method 6: Using Binet's formula

        //Method 7: Using matrix exponentiation

        //Method 8: Using the golden ratio

        //Method 9 : Using the power of the matrix {{1,1},{1,0}}



    }

    static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    private static void fib2(int n, int a, int b) {

        //It will give till the term n-1
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    private static void fib1(int n, int a, int b) {
        int count = 2;

        while(count <=n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }

}
