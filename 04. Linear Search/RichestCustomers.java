public class RichestCustomers {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1,5}};

//        int[] wealths = total_Wealth(accounts);
//        int maxWealth = maximumWealth(wealths);
//
//        System.out.println(maxWealth);

        System.out.println(maximumWealth(accounts));
    }


    // It will add the col and return the sub array
//    static int[] total_Wealth(int[][] accounts){
//
//        //take new array to add the sum of each col
//        int[] wealths = new int[accounts.length];
//
//        for (int row = 0; row < accounts.length; row++) {
//            int total = 0;
//            // when you start new column take each element and add it
//            for (int col = 0; col < accounts[row].length; col++) {
//                total =  total + accounts[row][col];
//            }
//            wealths[row] = total;
//        }
//
//        return wealths;
//    }


    //It will compare from subarray and return maximum
//    static int maximumWealth(int[] wealths) {
//        int max = 0;
//
//        for (int row = 0; row < wealths.length; row++) {
//            if (wealths[row] > max){
//                max = wealths[row];
//            }
//        }
//
//        return max;
//    }



    // Instead of creating this seprate function maxWealth i will merge this into above one

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum =0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }

            if (sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
