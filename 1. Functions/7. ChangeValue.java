import java.util.Arrays;

class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] =99;  //If you make a change to object via ref variable, same object will be changed
    }
}
