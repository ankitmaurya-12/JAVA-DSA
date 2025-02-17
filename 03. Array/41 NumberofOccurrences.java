//problem 41:
// Create a proram to find the number of occurrences of an element in an arry.

import java.util.Scanner;

class NumberofOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find No. of Occurrences !!");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find : ");
        int num = input.nextInt();
        
        int occurrencess = noOfOccrr(numArr,num);
        System.out.println("Your number "+ occurrencess +" times occurred in array.");
    }

    public static int noOfOccrr(int[] arr, int num){
        int occ =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                occ++;
            }
        }
        return occ;
    }
}
