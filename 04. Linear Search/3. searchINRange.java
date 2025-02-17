import java.util.Scanner;

class searchINRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr ={45,75,84,9,7,5,85,94,75,12,34};

        System.out.println("Enter the no. you wanna search : ");
        int target = in.nextInt();

        System.out.println("Enter the Start point : ");
        int start = in.nextInt();

        System.out.println("Enter the End point : ");
        int end = in.nextInt();

        System.out.println("Target exist at index : " + inRange(arr,target,start,end));

    }

    static int inRange(int[] arr, int target, int start, int end){

        //Check if array exist or not
        if (arr.length == 0){
            return -1;
        }

        //iterate over the array and compare
        for (int index = start; index < end; index++) {
            if (arr[index] == target){
                return index;
            }
        }

        //if no element find it will return -1
        return -1;
    }
}
