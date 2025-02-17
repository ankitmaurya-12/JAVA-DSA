import java.util.Scanner;

class FindLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = 10;
//        int b = 20;
//        int c = 30;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Using method 1: if-else
        max1(a, b, c);

        // Using method 1a: if-else with a different approach
        max1a(a, b, c);

        // Using method 2: ternary operator
        max2(a, b, c);

        // Using method 3: Math.max()
        max3(a, b, c);
    }

    // Method 1: Using if-else
    static void max1(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Max (if-else): " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Max (if-else): " + b);
        } else {
            System.out.println("Max (if-else): " + c);
        }
    }

    // Method 1a: Using step-by-step comparison
    static void max1a(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max (if-else approach 2): " + max);
    }

    // Method 2: Using the ternary operator
    static void max2(int a, int b, int c) {
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max (ternary operator): " + max);
    }

    // Method 3: Using Math.max()
    static void max3(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Max (Math.max): " + max);
    }
}
