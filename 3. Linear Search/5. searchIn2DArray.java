import java.util.Arrays;

class searchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {10,28,33,1},
                {47,5,96},
                {14,28,12},
                {7,3},
        };

        // int target = 28;  //here is trick 28 occurs two time hence you have to all the index on hashMAP

        int target = 12;

        int[] ans = search(arr, target);

        System.out.println("Element found at index : " + Arrays.toString(ans));

        System.out.println("Max value in matrix is : " + max(arr));


    }



    // To find the target index
    static int[] search(int[][] arr, int target){


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
             if (arr[row][column] == target){
                 return new int[]{row,column};
             }
            }
        }
        return new int[]{-1,-1};
    }



    // To find the max value
    static int max(int[][] arr){

        // int max = arr[0][0];   // > we can write this

        int max = Integer.MIN_VALUE;  // > we can also write this
        // Here we ourself assume the minimumvalue that is -78457879510365
        // then it will compare with first element i.e. 10. It is obviously greater than MIN_Value so max value will get updated
        // and this one will continue so far till the end

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
             if (arr[row][column] > max){
                 max = arr[row][column];
             }
            }
        }
        return max;
    }
}
