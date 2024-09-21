import java.util.Arrays;

class VariableArgument {
    public static void main(String[] args) {

        //Variable Arguments(Varargs):
        //The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter but it was not considered good because it leads to the maintenance problem. If we don't know how many argument we will have to pass in the method, varargs is the better approach.

        func(2,3,4,5,6,7,8,99,0,4 );

        funcho(1,"Ankit",4,5,6,8,7,8,8);

    }

//    static void func(int...values){  //=> it can be this or below one. It can take int, String, char
    static void func(int... v){     //v define it can be of any variable lenngth
        System.out.println(Arrays.toString(v));
    }

    static void funcho(int a, String b, int... v){

        //it can also define with others int string and char
        // 📌IMP: variable length argument should be last

        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
