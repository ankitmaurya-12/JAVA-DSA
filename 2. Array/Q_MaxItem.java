import java.util.Arrays;

public class Q_MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,30,47,76,25,53,90};

        System.out.println("Max item in array is :");
        System.out.println(maxItem(arr));
        System.out.println("Max item in range of array is :");
        System.out.println(maxItemInRange(arr, 1,4));

    }


    static int maxItem(int[] arr) {

        int max = arr[0];

        // Method 1:
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//            max = arr[i];
//            }
//        }

        // Method 2:
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }



    static int maxItemInRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
