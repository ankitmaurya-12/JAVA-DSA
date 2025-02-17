public class CondironMain {
    public static void main(String[] args) {

        System.out.println("If Statement :" );
        ifStatement();
        System.out.println("\nIf Else Statement :");
        ifElse();
        System.out.println("\nIf Else If Statement :");
        ifElseIf();
        System.out.println("\nFor Loop Statement :");
        forLoop();
        System.out.println("\nwhile Loop Statement :");
        whileLoop();
        System.out.println("\nDo while Loop Statement :");
        doWhileLoop();
        System.out.println("\nBreak Statement :");
        breakStatement();
        System.out.println("\nContinue Statement :");
        continueStatement();
        System.out.println("\nNested Loop Statement ");
        nestedLoop();
        System.out.println("\nFor Each Loop Statement :");
        forEachLoop();
        System.out.println("\nSwitch Statement :");
//        switchStatement();

        System.out.println("\n Print number from 1 to n :");
        printNumber(100);

        System.out.println("\n Print number from n to 1 :");
        printNumberReverse(100);

        System.out.println("\nPrint even number");
        printEvenNumber(100);

        System.out.println("\nPrint odd number");
        printOddNumber(100);

        System.out.println("\nPrint 1 to n number with sum");
        printNumberWithSum(100);
    }

    private static void printNumberWithSum(int i) {
        int sum = 0;
        for(int j = 1; j<=i; j++){
            sum = sum + j;
            System.out.println(j + " : " + sum);
        }
        System.out.println("Hence Sum of " + i +" number is : " + sum);
    }

    private static void printOddNumber(int i) {
        for( int j =0; j<=i; j++){
            if(j%2 != 0){
                System.out.println(j);
            }
        }
    }

    private static void printEvenNumber(int i) {
        for( int j = 1; j<=i; j++){
            if(j%2 == 0){
                System.out.println(j);
            }
        }
    }

    private static void printNumberReverse(int i) {
        for(int j = i; j >= 1; j--){
            System.out.println(j);
        }
    }

    private static void printNumber(int j) {
        for (int i = 1; i<=j; i++){
            System.out.println(i);
        }
    }

    static void ifStatement() {
        int salary = 25000;
        if (salary > 20000) {
            System.out.println("You are rich!");
        }
    }

    static void ifElse() {
        int salary = 25000;
        if (salary > 20000) {
            System.out.println("You are rich!");
        } else {
            System.out.println("You are poor!");
        }
    }

    static void ifElseIf() {
        int salary = 25000;
        if (salary > 20000) {
            System.out.println("You are rich!");
        } else if (salary > 10000) {
            System.out.println("You are middle class!");
        } else {
            System.out.println("You are poor!");
        }
    }

    static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    static void breakStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    static void continueStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void nestedLoop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    static void forEachLoop() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void switchStatement(){

//        switch ( int)

    }
}
