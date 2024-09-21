// Problem: 
// Array traversal
// take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class ArrProblem1 {

    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    // Get array size from user
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    
    int numbers[] = new int[size];

    
    
    // input
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<numbers.length; i++){
        numbers[i]= sc.nextInt();
    }
    
    System.out.print("Enter the number to search:");
    int x = sc.nextInt();

    // output
    for(int i=0; i<numbers.length; i++){
        if(numbers[i] == x){
            System.out.println("X found at index :" + i);
        }
    }
    System.out.println("This is ankit maurya.!!");
    }
}
