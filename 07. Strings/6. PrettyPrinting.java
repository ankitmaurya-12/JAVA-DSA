import java.util.Calendar;
import java.util.Locale;

//https://stackabuse.com/how-to-format-a-string-in-java-with-examples/

class PrettyPrinting {
    public static void main(String[] args) {
        //It exactly same as C programming language

        float a = 453.568745F;

        System.out.printf("Formatted number is %.2f", a);

        System.out.println();
        System.out.println(Math.PI);

        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();
        System.out.printf("Hello, My name is %s and I am %s. \n", "Ankit", "Developer");

        /*
        There are many format specifiers we can use. Here are some common ones:

                %c - Character
                %d - Decimal number (base 10)
                %e - Exponential floating-point number
                %f - Floating-point number
                %i - Integer (base 10)
                %o - Octal number (base 8)
                %s - String
                %u - Unsigned decimal (integer) number
                %x - Hexadecimal number (base 16)
                %t - Date/time
                %n - Newline

          Though, certain combinations (also called commands) have a different meaning to the compiler:

                \b - Insert backspace
                \f - Next line's first character starts to the right of current line's last character
                \n - Insert newline
                \r - Insert carriage return
                \t - Insert tab
                \\ - Insert backslash
                %% - Insert percentage sign

          */

        System.out.printf("The quick brown %s jumps %d times over the lazy %s.\n", "fox", 2, "dog");

        //Format Padding
        System.out.printf("%10s\n", "stack");

        //Locale
        System.out.printf(Locale.US, "%,d\n", 5000);
        System.out.printf(Locale.ITALY, "%,d\n", 5000);


        //String.format()
        String formattedString = String.format("Local time: %tT", Calendar.getInstance());
        System.out.println(formattedString);

        //In JAVA + operator is intensionally overloaded


    }

}
