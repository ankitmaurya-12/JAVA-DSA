import java.util.Scanner;

class StringExm {
    public static void main(String[] args) {

//        String msg = greet();
//        System.out.println(msg);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = in.next();
        String personaliseMsg = mygreets(name);
        System.out.println(personaliseMsg);
    }

    static String mygreets(String name) {
        String msg ="Hello " + name;
        return msg;
    }

    static String greet(){
        String greet = "How are you??";
        return greet;
    }
}

