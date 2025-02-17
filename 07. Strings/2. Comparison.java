class Comparison {
    public static void main(String[] args) {

        String a = "Ankit";
        String b = "Ankit";

        //Method 1 : ( == )
        System.out.println( a == b );

        //It will always point same value in heap memory.


        //What if we want it diffrent value in heap memory despite having same value


        //How to create a different object of the same value

        String c = new String("Ankit");
        System.out.println( a == c);          //lets Compare c and a will return false

        String d = new String("Ankit");
        System.out.println( c == d);          //Or compare c and d will return false



        //Method 2:
        // When you need to check the only value
        System.out.println(a.equals(b));        //btw a and b
        System.out.println(a.equals(c));        //btw a and c
        System.out.println(d.equals(c));        // btw c and d

        //Here we can't do like this a[2];
        //instead we use charAt() method

        System.out.println(a.charAt(2));  //return k
        System.out.println(a.charAt(7));  // Index 7 out of bounds for length 5

    }
}
