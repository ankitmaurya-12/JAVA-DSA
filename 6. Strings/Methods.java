import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ankit Maurya";

        //toCharArray  - to convert it into Array
        System.out.println(Arrays.toString(name.toCharArray()));

        //to lowercase
        System.out.println(name.toLowerCase());

        //to Uppercase
        System.out.println(name.toUpperCase());

        //charAt to find on particular index
        System.out.println(name.charAt(6));

        //to find character from index
        System.out.println(name.indexOf('n'));

        //find last index of
        System.out.println(name.lastIndexOf('a'));

        //replace
        System.out.println(name.replace('A', 'M'));

        //Strip - remove extra spaces
        System.out.println("         king t        ".strip());

        //split
        System.out.println(Arrays.toString(name.split(" ")));

        //contain
        System.out.println(name.contains("b"));
    }
}
