class bsInSortedRotatedArray {
    public static void main(String[] args) {

        int[] arr = {43,2,4,5,7,11};
        int index = minElement(arr);
        System.out.println("Minimum index is " + arr[index]);

        rotationCountInACWSA(arr);
        rotationCountInCWSA(arr);
    }

    static void rotationCountInACWSA(int[] arr) {
        int index = minElement(arr);
        System.out.println("ACW Rotation count is : " + ((arr.length - index) % arr.length));
    }
    static void rotationCountInCWSA(int[] arr) {
        int index = minElement(arr);
        System.out.println("CW Rotation count is : " + index);
    }

    static int minElement(int[] arr ){
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            //If right half is sorted, move left
            else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } //if left half is sorted, move right
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int minElementDuplicates(int[] arr ){
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            //If right half is sorted, move left
            else if (arr[end] >= arr[mid]) {
                end = mid - 1;
            } //if left half is sorted, move right
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}
