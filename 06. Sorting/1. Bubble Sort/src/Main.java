import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){

        boolean swapped;

        //Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            swapped = false;

            //for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you didn't swap for particular value of i, it means the array is sorted hence stop the program
            if (!swapped){
                break;
            }
        }
    }

}