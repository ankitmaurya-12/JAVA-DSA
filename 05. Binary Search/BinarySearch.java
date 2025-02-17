import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3,4,5,6,7,8,9,10,11,86,95,123,587,1000,1258};

        System.out.println("Enter the target which you wanna find : ");
        int target = in.nextInt();

        int ans = binarySearch(arr, target);

        System.out.println("Element found at index " + ans);

    }

    //Binary Search :-
    // (Sorted Array)
    // It is optimized way to search

    // Steps:
    // 1. Find middle element
    // 2. target > middle => search in right else search in left
    // 3. if middle element == target element
    // 4. if start > element : element not found


    // Why Binary search :-
    // best case : o(1)
    // worst case : n/2^k ==> o(logn)

    // 0th ->  n -> n/2^0
    // 1st ->  n -> n/2^1
    // 2nd ->  n -> n/2^2
    // 3rd ->  n -> n/2^3
    // 4th ->  n -> n/2^4
    // ..  ->  . -> ...
    // kth ->  . ->  n/n^k

    // in last we will have 1 element == n/n^k
    // n/2^k  == 1
    // n      == 2^k
    // logn   == log2^k
    // logn   == klog2
    // logn/log2 == k
    // k == logn

    //imagine if we have array of 1000000
    // linear search will take 1000000
    // but binary will take only 20 search. it will incrase the search.


    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){

            //find middle element
//            int mid = (start + end)/ 2;   //might be possible that (start + end) exit the range of integer

            int mid = start + (end - start) / 2;  // start never gonna be more than end hence we written this, it is same thing but diffrent way of writting

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //Ans found
                return mid;
            }
            // for decreasing array reverse it
            // if we not aware of if array is increasing or decreasing we will use if(end > start)
        }
        
        return -1;
    }




}
