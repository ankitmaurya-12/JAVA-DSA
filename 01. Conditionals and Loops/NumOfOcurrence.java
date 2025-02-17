public class NumOfOcurrence {
    public static void main(String[] args) {
        int n = 1223334444;
        int x = 4;

        
        System.out.println("Number of occurrence of " + x + " in " + n + " is : " + countOccurrence(n, x));
    }

    private static String countOccurrence(int n, int x) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == x) {
                count++;
            }
            n = n / 10;
        }
        return String.valueOf(count);
    }
}
