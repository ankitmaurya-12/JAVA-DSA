// Leetcode 1295 :
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evenDigitQuestion {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])){
                count++;
            }
        }

        // We can also use the advance for loop
//        for (int num : nums){
//            if (even(num)){
//                count++;
//            }
//        }

        return count;
    }

    //function to check wheater number is even or not
    // There are two methods to do that:
    // 1. Count the number of digit in each numbers
    // 2. convert it into string and take the length of it
    // {Method 2: worst approach }
    // {
    // int count = 0;
    // for(int e:nums){
    //            String s=Integer.toString(e);
    //            if(s.length()%2==0)
    //            count++;
    //        }
    // }



    static boolean even(int nums){
//        int numberOfDigits = digits(nums);
        int numberOfDigits = digits2(nums);


        if (numberOfDigits % 2 == 0){
            return true;
        }

        return false;
    }


    // count the number of digit in a number
    static int digits(int num){
        int count = 0;

        if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        while (num>0){
            count++;
            num = num / 10;    //=> it used to remove last digit of number
        }

        return count;
    }

    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }

        return (int)(Math.log10(num)+1);
    }


}
