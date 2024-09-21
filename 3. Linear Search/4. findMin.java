class findMin {
    public static void main(String[] args) {
        int[] arr ={45,75,84,9,-7,5,85,94,75,12,34};

        System.out.println("Minimum value in array is " + min(arr));
    }

    static int min(int[] arr){

        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minimum>arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
