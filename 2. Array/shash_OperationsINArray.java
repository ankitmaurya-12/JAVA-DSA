public class shash_OperationsINArray {
    public static void main(String[] args) {

        int[] arr = {45,78,3,32,8,5};

        System.out.println("Before the Operations !!");
        printArray(arr);

        insert(arr, 2, 100);


        System.out.println("After the Insert Operations :-");
        printArray(arr);


        deleteFromArray(arr, 4);
        System.out.println("After the Delete Operations :-");
        printArray(arr);

    }

    static void insert(int[] arr, int pos, int element){

        int size = arr.length;

        if(pos<0 || pos>size-1){
            System.out.println("Index not exists");
            return;
        }
        for (int i = size-2; i < 0; i++) {
            arr[i+1] = arr[i];
        }
        arr[pos] = element;

    }

    static void deleteFromArray(int[] arr, int pos){
        for (int i = pos; i < arr.length-2; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


}
