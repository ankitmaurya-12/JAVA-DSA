import java.util.Arrays;

public class Q_Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7};

        System.out.println("Before swapping Arr :");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        swap(arr, 1, 3);

        System.out.println("After swapping Arr :");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        reverArr(arr);
        System.out.println("After reversing Arr :");
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Reverse array using swap function
    // This is two pointer method
    static void reverArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
