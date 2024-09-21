
class Swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;

        //swap numbers
//        int temp =a;
//        a = b;
//        b= temp;


        swap(4,6);
        System.out.println(a + " " +b);


        String name="Ankit Maurya";
        changeName(name);
        System.out.println(name);
    }

    //Example 1:

    //it's not changing instead calling it in main function
    static void swap(int a, int b){
        int temp =a;
        a = b;
        b= temp;
    }

    //Example 2:

    //it not changes instead calling it in main function
    static void changeName(String name){
        String naam ="Shubham Varma";    // here the naam variable scope is limited to this function only, It will never affect the main function
    }


}
