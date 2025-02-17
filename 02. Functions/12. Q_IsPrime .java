import java.util.Scanner;

class Questions {
    public static void main(String[] args) {

        //Q. To check number is prime or not using Methods
        Scanner in =new Scanner(System.in);

        System.out.println("Enter your number to check prime or not :");
        int n=in.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;
    }
}
