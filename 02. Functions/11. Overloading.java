import java.util.Arrays;

class Overloading {
    public static void main(String[] args) {

        //Method Overloading:
        //If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

        //If we have to perform only one operation, having same name of the methods increases the readability of the program.

        //Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

        //So, we perform method overloading to figure out the program quickly.


        //There are two ways of method overloading:
        //1. By changing number of arguments
        //2. By changing the data type


        func(4);  //when we pass int it will pass in first function with integer
        func("Ankit");  //when we pass int it will pass in first function with String


        sum(4,7);
        sum(20,57,88);


        demo(4,8,9,5,22,78,100);
        demo("a","b","c","d","e");

        // Suppose If don't pass any value it will give ambiguity error
        // Ambiguity: Compiler can't decide between demo(int...v) and demo(String...v)
        // demo();
    }

    //Two function can exist simultaneously but there argument should different

    //Example 1:
    static void func(int a){
        System.out.println(a);

    }

    static void func(String b){
        System.out.println(b);
    }


    //Example 2:
    static void sum(int x, int y){
        int sum = x+y;
        System.out.println(sum);
    }

    static void sum(int x, int y, int z){
        int sum = x+y+z;
        System.out.println(sum);
    }


    //Example 3:
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
