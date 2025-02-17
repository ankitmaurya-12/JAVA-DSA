import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // topic 1: declaring array from itself
        
        // initailizing array
        // int[] marks = new int[3];

        // we can also initialize it like 
        // int maarks[] = new int[4];
        
        // storing value in array
        // marks[0]=90;
        // marks[1]=83;
        // marks[2]=95;

        
        // intialize + stor value
        // int[] marks ={79,89,30,28};
        // or
        // int marks[] ={79,89,30,28};


        // we have to define positions esle it will print garbage value
        // System.out.println(marks);

        
        // printing array
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        
        // Print using loop
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        
        
        

        
        // topic 2: declaring array from user

//        Scanner sc = new Scanner(System.in);
        // scanner class is used to take integer from user

//        int size = sc.nextInt();
        // in above we storing the size of array


//        int numbers[] = new int[size];
        
        // store the value
//        for (int i = 0; i < size; i++) {
//            numbers[i] = sc.nextInt();
//        }

        // print the value
//        System.out.println("The inputs are :");
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
//        }



        // We can also use this arr with string
        String[] stringArray = new String[4];
        stringArray[0] = "My String";

        System.out.println(stringArray[0]);

        String[] newStrArr = {"first", "second", "fourth", "5"};
        System.out.println(newStrArr.length);
    }
}
