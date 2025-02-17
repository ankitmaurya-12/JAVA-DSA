import java.util.Arrays;

class LinearSearchString {
    public static void main(String[] args) {

        String name = "Ankit";

        char target = 'n';   //=> in java single string is used for char and double string is used for String

        System.out.println(search2(name,target));

        //this is use to convert each word of char into arraylist like structure(string)
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    //Method one [1] of searching
    static boolean search(String str, char target){

        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    //Method two [2] of searching
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
