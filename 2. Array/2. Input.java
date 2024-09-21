import java.util.Arrays;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


//_____Array OF Premetives______________________________________

        int[] arr= new int[5];
        // arr[0] = 15;
        // arr[1] = 45;
        // arr[2] = 4545;
        // arr[3] = 454;
        // arr[4] = 455;

        // There are various methods to print an Array in JAVA



        // Method 1️⃣ :
        // [15, 45, 4545, 454, 455]
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);



        //Input using for loop
//        System.out.println("Enter the element : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }




        // Method 2️⃣:
//        System.out.println("You have written : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }





        // Method 3️⃣:
        // Advance Method for printing items =>
//        for (int nums : arr) {              // for every element in array, print the element
//            System.out.print(nums + " ");   // here nums represent element of the array
//        }

//        System.out.println(arr[5]);  // index out of bound if we tries to access the non assigned value in array



        //Method 4️⃣ :
        // It is simplest and best way in one line
//        System.out.println(Arrays.toString(arr));




//_____Array OF NON-Premetives______________________________________


        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }

        System.out.println(Arrays.toString(str));


        // Modify the array
        str[1] = "ANkit";          // call by value ( (refence): it just change in non-premetive data type not in premetive data type)
        System.out.println(Arrays.toString(str));






    }
}
