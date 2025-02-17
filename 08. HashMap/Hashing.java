import java.util.HashMap;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {

        //If we want to find the repetition of integer numbers
//        integer();

        //If we want to find the repetition of character String
//        character();

        //Integer repetition usinf hashMap
        hashmap();

    }

    static void integer() {
        Scanner sc = new Scanner(System.in);

        //    5
        //    1 2 4 2 1
        //    5
        //    1 4 2 3 12

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];       //here we assume that the array is of size 13. but in real world i can have 10^10/12/20 etc.
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }

    static void character() {

        //For LowerCases
        // 'a' => 97;
        // 'z' => 122;

        //'a' - 'a' => 0
        //'b' - 'a' => 1
        //'f' - 'a' => 5
        // ....

        //abcdeafcaadbea
        //5
        //a
        //e
        //b
        //d
        //z

        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }

    }

    static void hashmap() {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); // inserting into the map
        }


        // Iterate over the map:
        /*
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        */

        int q;
        q = sc.nextInt(); // read the number of queries
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);
        }

    }
}
