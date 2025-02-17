import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of element");

        int size = input.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element no " +(i+1) + " :");
            nums[i]= input.nextInt();
        }
        return nums;
    }
}

