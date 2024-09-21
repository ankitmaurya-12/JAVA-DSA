import java.util.Arrays;
import java.util.Scanner;

class MultidimenssionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */

        // Matrix :
        // It is Arrays of Array
        // in JAVA it also non-continous memory

//        int[][] array2D = new int[3][]; // => No. of rows is mandatory not column

        //=> we can also define like it no manadatory that colum wil be 3.
//        int[][] matrix = {
//            {1, 2, 3},      //0th index
//            {4, 5},         // 1st index
//            {7, 8, 9, 10}   // 2nd index => arr[2] = {7, 8, 9, 10}
//        };


        int[][] arr= new int[3][3];
//        System.out.println(arr.length);    //=> It will give length of rows

        //Input =>
        for (int row = 0; row < arr.length; row++) {
            //for each co in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        //Output Method 1:-
//        for (int row = 0; row < arr.length; row++) {
//            // for each col i every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            // for adding new line after each col done
//            System.out.println();
//        }

        // Output Method 2:
//        for (int row = 0; row < arr.length; row++) {
//            // for each col i every row
//            System.out.println(Arrays.toString(arr[row]));
//        }


        //Output 3:
        // Enhanced method
        // for (each dataype(a) of arr) -> print the a
        // in this case dataype is itself array so we declare int[] a , here a is just a name. which represent the arr[row]

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }



    }
}
