class Array {

    public static void main(String[] args) {

        //Q. Store a roll no.
        int a =10;

        //Q. Store a person name
        String name="Ankit";

        //Q.Store 5 roll numbers
        int rol1 = 10;
        int rol2 = 11;
        int rol3 = 12;

        //Sytax of an Array
        //datatype[] variable_name= new datatype[size]
        //Store 5 roll no.

        int[] roll_no = new int[5];

        //or directly write
        int[] roll_nos = {1,2,3,4,5};

        //In JAVA array store a particular datatype value only
        //If it int it will store integer only unlike JAVASCRIPT which store everythin

        //Declaration of an Array :
        int[] rows;         // Declartion => here just ros getting define in the stack memory  || it happen in compile Time
        rows = new int[5];  // Initialization => here the actual object is created in the memory(heap)  || its happen in Run Time

        // 1. Array objects are in HEAP
        // 2. HEAP objects are not continuous
        // 3. DMA (:-> Declaration at Compile time & Initialization at Run Time <-:)

        // In JAVA, Definitions says Arrays are continuous block of code, but internally its store in heap hence it may not be continuous it depend on the JVM
        // 📌 Dynamic memory Allocation: -
        //In Java, dynamic memory allocation is handled automatically by the JVM (Java Virtual Machine). Unlike languages like C++, Java does not require explicit memory allocation and reallocation using functions like malloc() and free().

        //Here's how dynamic memory allocation works in Java:

        //1. Object Creation:
        //When you create an object using the new keyword, memory is dynamically allocated on the heap for that object.
        //The new keyword returns a reference to the created object, which is stored in a variable.

        //MyClass obj = new MyClass();

        //2. Heap Memory:
        //The heap is a large pool of memory where objects are stored.
        //The size of the heap can grow or shrink dynamically as needed during program execution.

        //3. Garbage Collection:
        //Java uses a garbage collector to automatically reclaim memory that is no longer in use.
        //The garbage collector periodically identifies objects that are no longer referenced by any active part of the program and frees up their memory.
        //This eliminates the need for manual memory deallocation, reducing the risk of memory leaks and making Java programming safer and more convenient.

        //Key Points:
        //All objects in Java are created on the heap.
        //The new keyword is used to allocate memory for objects.
        //The garbage collector automatically deallocates memory for unused objects.
        //Developers do not need to explicitly manage memory allocation or reallocation.
        // 📌 [DMA Ends HERE]


        // System.out.println(roll_no[0]);  //If not assigned it will always 0


        // String with array
        String[] strong = new String[3];
        System.out.println(strong[0]);     //If String Array is not define it will print "null"

        // "null" :-
        // 1. We can assign null only to Non-primitive datatype can't assign null to primitives datatype
        // 2.  By default, reference variable has a null type e.g. int[] rows;
        // Premetive: Are stored internally in Stack memory
        //Non-Premetive : Are internally stored in HEAP Memory

        // String :
        // 📌🙏🏻 watch Kunal's Array video at 23:30



    }


}
