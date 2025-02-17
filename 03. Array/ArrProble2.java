// problem 2
// Array traversal

import java.util.Scanner;

public class ArrProble2  {
    public static void main(String[] args) {
        System.out.println("Hello World from Ankit Maurya !!");

        Scanner input = new Scanner(System.in);
        int[] arr = {2,6,56,78,42,59,78,1,36,75};

        System.out.println("Welcome to Array Searching.");

        System.out.println("Enter the number you want to search: ");

        int num = input.nextInt();

        boolean isFound = isFound(arr, num);

        if (isFound){
            System.out.println("Your number was found in array.");
        }else {
            System.out.println("Your number is not in string.");
        }
    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index< arr.length){
            if (arr[index] == num){
                return true;
            }
        index++;
        }
        return false;
    }
}