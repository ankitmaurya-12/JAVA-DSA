//problem 40:
//

import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");

        // we can use this
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of element :");

        int size = input.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element no " +(i+1) + " :");
            nums[i]= input.nextInt();
        }

        // Or we can use utility class
        // int[] numArray = ArrayUtility.inputArray();

        long sum=sum(nums);
        double average=average(nums);

        System.out.println("The sum of array is " + sum+ " And average is " + average + ".");
    }
        public static long sum(int[] nums){
            long sum =0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
            return sum;
        }
        public static  double average(int[] nums){
            double sum= sum(nums);
            double avg= sum/ nums.length;
            return avg;
        }
}
