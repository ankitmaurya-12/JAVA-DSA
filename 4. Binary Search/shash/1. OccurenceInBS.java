import java.util.Arrays;

class OccurenceInBS {

    public static void main(String[] args){

        int arr[] = {2,2,2,2,3,4,4,5,6,9,9,9,7,7,8,8};
        int target = 50;

        // Trick: Don't apply blindly binary search.
        // Look array is sorted or not, here it not sorted means result will give error
        // if question is not related to indexing then sort array

        // Sort the array before performing binary search
        Arrays.sort(arr);                //import inbuild sort function but again it increase the time complexity

        int first = binarySearch(arr, target, true);
        int last = binarySearch(arr, target, false);

        if (first == -1){
            System.out.println("Occurence is 0");
        } else
            System.out.println("Occurence of target is : " + (last - first + 1));

    }

    static int binarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start<= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                ans = mid;
                if (isFirst){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid]<target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

