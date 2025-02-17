class Shadowing {

    static int x = 85;       //this will be available inside every block under it

    public static void main(String[] args) {

        System.out.println(x); //no error

        // Shadowing:
        //Shadowing in JAVA occurs when a variable declared within a certain scope has the same name as a variable in an outer scope. The inner variable "shadows" the outer one, making the outer variable inaccessible within the inner scope.

        // int x= 45;  //it have local scope, Shadow the global one

        int x;  //=> Declaring the x
        // System.out.println(x);  //it will give error cause scope start from initalization
        x=45;   //=> initalizing the x


        System.out.println(x);

        fun();
    }

    static void fun(){
        System.out.println(x);  //no error
    }
}
