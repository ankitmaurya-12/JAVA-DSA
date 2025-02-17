import java.util.ArrayList;

class Operators {
    public static void main(String[] args) {

        System.out.println('a' +'b');      //character ' '

        System.out.println("a" + "b");     //String " "

        System.out.println('a' + 5);
        System.out.println((char) ('a' + 5));     //convert number into character

        System.out.println("a" + 2);
        //Here Integer will converted to Integer that will call toString()
        //this is same after a few steps "a" + "2"

        System.out.println("Ankit" + new ArrayList<>());     //Ankit[]

        System.out.println("Ankit" + new Integer(29));   //Ankit29

//        System.out.println(new Integer(29) + new ArrayList<>());
        //Error Operator plus is only define for the Premetives and String can't be applied on the complex object either one of them should be string
        System.out.println(new Integer(29) + "" + new ArrayList<>());     //29[]



    }
}
