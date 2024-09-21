import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = {78,65,52,49,40,32,25,12,8,5,1};
        int[] arr = {1,5,7,9,10,16,24,33,38,49,80,95,754};

        System.out.println("Enter element which you wanna find :");
        int target = in.nextInt();

        int ans = orderAgnosticBS(arr, target);

        System.out.println("Element found at index " + ans);
    }


    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        //find weather the array is sorted in ascending order or descending order
        boolean isAscending;
        isAscending = arr[start] < arr[end];

        while (start <= end){

            //take mid of the array
            int mid = start+ (end - start) / 2;

            //mid is common part so check it earlier if exist or not
            if (target == arr[mid]){
                return mid;
            }


//            if (isAscending) {              //if isAscending is true it will run ascending code
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                }
//            }
//            else{                          //else it will run descending code
//                 if (target > arr[mid]) {
//                    end = mid - 1;
//                } else if (target < arr[mid]) {
//                    start = mid + 1;
//                }


            // instead of changing + - change the <>.
            if (isAscending) {              //if isAscending is true it will run ascending code
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{                          //else it will run descending code
                 if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }

        return -1;
    }
}
