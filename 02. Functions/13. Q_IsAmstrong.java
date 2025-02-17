import java.util.Scanner;

class IsAmstrong {
    public static void main(String[] args) {

    //Q. To check if number is amstrong or not.
        // 153 = 1^3 + 5^3 +3^3
        //     = 1 + 125 + 27
        //     = 153

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to check weather is Armstrong or not :");
//        int n = in.nextInt();

//        System.out.println(isArmstrong(n));

        // It will print all the armstrong number
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
