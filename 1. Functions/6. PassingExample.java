class PassingExample {
    public static void main(String[] args) {

        // Call By Value:
        // There is only call by value in java, not call by reference.
        // If we call a method passing a value, it is known as call by value.
        // The changes being done in the called method, is not affected in the calling method.
        //Also String is immutable for security reasons in JAVA.


        String chacha= "Ankit maurya";  //We assigned String = "Ankit Maurya" to chacha
        greet(chacha);                  // But here we're actually passing String that we assigned to chacha

    }

    static void greet(String naam){   //Here It getting string name is just Variable name, It could be anything, It doesn't matter with the above variable name.
        System.out.println(naam);
    }
}
