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
