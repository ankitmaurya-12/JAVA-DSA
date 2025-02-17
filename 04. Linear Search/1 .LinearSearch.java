import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr ={14,26,85,83,537,45,23,64};

        System.out.println("Enter the no. you want to find :");
        int tar = in.nextInt();

        System.out.println("Element exist at index " + isExist(arr, tar) );

        System.out.println(isExistElement(arr, tar));

    }

    static int isExist(int[] arr, int target){

        //Check if array exist or not
        if (arr.length == 0){
            return -1;
        }

        //iterate over the array and compare
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }

        //if no element find it will return -1
        return -1;
    }

    static int isExistElement(int[] arr, int target){

        //Check if array exist or not
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //iterate over the array and compare
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return arr[index];
            }
        }

        //if no element find it will return -1
        return Integer.MAX_VALUE;
    }
}
