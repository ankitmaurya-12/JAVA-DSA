import java.util.Scanner;

class Sum {
    public static void main(String[] args) {

//        sum();  //sum is function & () is call => so it is function call

//        int ans = sumation();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);

    }

    static void sum(){  //here its function definition
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1= in.nextInt();

        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();

        System.out.println("The sum of two number is "+ (num1+num2));

        //some it should return function; of particular return type like void, int, char, bool etc
    }


    static int sumation(){
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1= in.nextInt();

        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();

        int sums =num1+num2;

        return sums;
        //After return call no code work


    }
    //Methods
    /*
         access modifier (We will look in OOPs return_type name (){
         // body of function
         return statement;
         }
     */

    //pass the value of the number when you are calling the methods in main
    static int sum3(int a, int b){
        int sum =a+b;
        return sum;
    }
}
