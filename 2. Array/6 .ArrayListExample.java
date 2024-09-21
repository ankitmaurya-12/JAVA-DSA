import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ArrayList: (Dynamic Array) =>
        // Java ArrayList class uses a dynamic array for storing the elements.
        // It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array.
        // It is found in the java.util package. It is like the Vector in C++.


        //Syntax:
        ArrayList<String> list = new ArrayList<>();

        // ArrayList<int> al = ArrayList<int>(); // does not work
        ArrayList<Integer> al = new ArrayList<Integer>(10); // works fine
        // " After equal to new ArrayList<___>();
        // its not compulsory to specify datatype"
        // Also its not mandatory to specify initalCapacity

        //Adding object in arraylist
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);



        // Internally the ArrayList<>() go to the toString and call it hence while printing the output it shown in Arrays.toString format

        // We'll look in OOPs class


//        al.add(3);
//        al.add(3785);
//        al.add(458);
//        al.add(4);
//        al.add(49);
//        al.add(4975);


//        System.out.println(" Before doing oprations :>");
//        System.out.println(al);
//
//        al.set(0,1000);
//
//        al.remove(2);
//
//        System.out.println(" After doing oprations :>");
//        System.out.println(al);


//        System.out.println(al.contains(49));



        // Taking Inputs
        for (int i=0; i<5; i++){
            al.add(in.nextInt());
        }

        // Get item at particular index
        for (int i = 0; i < 5; i++) {
            System.out.println(al.get(i));  //pass index here, list[index] syntax will not work here

        }

//        System.out.println(al);

    }
}

