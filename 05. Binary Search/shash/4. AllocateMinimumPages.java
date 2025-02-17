// GFG : Allocate Minimum Pages
// ==> https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

// LeetCode : 1011. Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

//The both are similar

class AllocateMinimumPages {
    public static void main(String[] args) {

    }

    public static int minimumBookAllocation(int[] books, int students){
        if (books.length < students){
            return -1;
        }
        //Range will bw max of array and sum of array
        int start  = Integer.MIN_VALUE;  // for finding max elelemt
        int end =0;  //sum of array

        for (int i = 0; i<books.length; i++){
            if (books[i]>start){
                start = books[i];
            }
            end = end + books[i];
        }

        int res =-1;

        while (start<=end){
            //max pages that can be allocated to single student
            int mid = start + (end-start)/2;
            if (isAllocationPossible(books, mid, students)){
                res =mid;
                end =mid -1;
            }else {
                start = mid+1;
            }
        }

        return res;
    }

    static boolean isAllocationPossible(int[] books, int maxPages, int students){
        int currentStudents = 1;
        int pages =0;
        for (int i = 0; i < books.length; i++) {
            pages+= books[i];
            //if pages exced maxPages
            if (pages > maxPages){
                //allocate to next student
                currentStudents +=1;
                pages = books[i];
            }
            if (currentStudents> students){
                return false;
            }
        }
        return true;
    }
}
