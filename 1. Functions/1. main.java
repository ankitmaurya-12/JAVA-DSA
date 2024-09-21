import java.util.Scanner;

class main {
    public static void main(String[] args) {

        //In java functions and method is same thing.
        // Function in class is called mathods.
        //In java everything is written in JAVA.

        //Q: Take input of 2 number and print thw sum

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1= in.nextInt();

        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();

        System.out.println("The sum of two number is "+ (num1+num2));
    }
}
