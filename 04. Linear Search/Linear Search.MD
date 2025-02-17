# Linear Search : -

**What is linear Search ?**

Linear search is a simple searching algorithm that checks each element in a list sequentially until the desired element is found or the list ends. It is also known as a sequential search.

Characteristics:
1. Time Complexity: O(n), where n is the number of elements in the list.
2. Space Complexity: O(1), as it requires a constant amount of additional space.
3. Best Case: The element is found at the first position (O(1)).
4. Worst Case: The element is not found or is at the last position (O(n)).

**How does it work ?**

1. Start from the first element of the list.
2. Compare the target element with the current element.
3. If the target element is found, return its index.
4. If the target element is not found, move to the next element.
5. Repeat steps 2-4 until the target element is found or the list ends.
6. If the target element is not found after checking all elements, return -1.
7. The search is complete.


**Pseudocode:**

```java
public class linearSearchInArray{
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, -16, 23, 38, -56, 72, 91, 0};
        
        int target = 23;

        System.out.println(linearSearch(arr, target));  //output: 5
        
        
        //suppose target is not in the array
        target = 100;
        System.out.println(linearSearch(arr, target));  //output: -1
        
        //if we want user to input the target
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        target = sc.nextInt();
        System.out.println(linearSearch(arr, target));
        
    }
    
    //search in the array; return the index if item found 
    //otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target){
        
        if (arr.length == 0){
            return -1;
        }
        
        //run the for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it equal to target
            int element = arr[i];
            //return the index if element found
            if (element == target){
                return i;
            }
        }
        
        //this line will execute if none of the element is equal to target
        // hence it will return -1
        // return -1;
        
        //there might be case when -1 is a valid element
        //in that case return Integer.MIN_VALUE or Integer.MAX_VALUE
        return Integer.MAX_VALUE;
    }
    
    //if we want to return the element instead of index
    static int linearSearch2(int[] arr, int target){
        
        if (arr.length == 0){
            return -1;
        }
        
        //run the for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it equal to target
            int element = arr[i];
            //return the element if element found
            if (element == target){
                return element;
            }
        }
        
        //can also be done using for each loop
        // for (int element : arr){
        //     if (element == target){
        //         return element;
        //     }
        // }
        
        
        //this line will execute if none of the element is equal to target
        // hence it will return -1
        return -1;
    }
    
    //If we want to return true and flase
    static boolean linearSearch3(int[] arr, int target){
        
        if (arr.length == 0){
            return false;
        }
        
        //run the for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it equal to target
            int element = arr[i];
            //return true if element found
            if (element == target){
                return true;
            }
        }
        
        //this line will execute if none of the element is equal to target
        // hence it will return false
        return false;
    }  
}
```

**Applications:**

1. Searching for an element in an unsorted list.
2. Finding the position of an element in a list.
3. Checking if an element exists in a list.


# **Problems :** 

**Q1. Search in String ??**

```java
public class String{
    public static void main(String[] args) {
        String name = "Hello World";
        
        char target = 'o';
        
        System.out.println(linearSearchInString(name, target));  //output: true
        
        
        //VIMP: if we want to extract the each character of the string
        //use name.toCharArray();
        //char[] arr = name.toCharArray();
        //system.out.println(Arrays.toString(arr));  //output: [H, e, l, l, o,  , W, o, r, l, d]
        
        //Or can directly written as 
        System.out.println(Arrays.toString(name.toCharArray()));  //output: [H, e, l, l, o,  , W, o, r, l, d]
        
        
        //IMP : if we want to search for a substring
        //use name.contains("substring");
        //name.contains("World");  //output: true
        
        
    }
    
    static boolean linearSearchInString(String str, char target){
        
        if (str.length() == 0){
            return false;
        }
        
        //run the for loop
        for (int i = 0; i < str.length(); i++) {
            //check for element at every index if it equal to target
            char element = str.charAt(i);
            //return true if element found
            if (element == target){
                return true;
            }
        }
        
        //Or can be done using for each loop
        // for (char element : str.toCharArray()){
        //     if (element == target){
        //         return true;
        //     }
        // }
        
        //this line will execute if none of the element is equal to target
        // hence it will return false
        return false;
        
    }
}
```

Note: In the above code, we are searching for a character in a string. The logic is the same as searching for an element in an array. We iterate through each character in the string and compare it with the target character.


**Q. num.length vs name.length() ??**
Ans : 
- When its array its act a variable and when its string its act as method/function.
- num is an array, and arrays have a length property that returns the number of elements in the array.
- name is a string, and strings have a length() method that returns the number of characters in the string.
- Both num.length and name.length() are used to get the length of the array and string, respectively.
- The difference is in the syntax: num.length is a property, while name.length() is a method.


**Q2. Search in Range ??**

```java
public class SearchInRange{
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        
        int target = 3;
        int start = 1;
        int end = 4;
        
        System.out.println(linearSearchInRange(arr, target, start, end));  //output: 3
        
    }
    
    static int linearSearchInRange(int[] arr, int target, int start, int end){
        
        if (arr.length == 0){
            return -1;
        }
        
        //run the for loop
        for (int i = start; i <= end; i++) {
            //check for element at every index if it equal to target
            int element = arr[i];
            //return the index if element found
            if (element == target){
                return i;
            }
        }
        
        //this line will execute if none of the element is equal to target
        // hence it will return -1
        return -1;
    }
}
```


**Q3. Minimum Number in Array??**

```java
public class findMin{
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println(minimum(arr));   // Output: -7
    }
    
    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        
        if (arr.length == 0){
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        
        return min;
    }
}
```

**Q4. Maximum Number in Array??**

```java
public class findMax{
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println(maximum(arr));   // Output: 28
    }
    
    static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        
        if (arr.length == 0){
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        
        return max;
    }
}
```

**Q5. Find the first index of the element in the array ??**

```java
public class findFirstIndex {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 14, 75, 23, 14};

        int target = 14;

        System.out.println(firstIndex(arr, target));   // Output: 4
    }
    
    static int firstIndex(int[] arr, int target){
        
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        
        return Integer.MAX_VALUE;
    }
}
```

**Note** : Linear search is best suited for unsorted arrays, as it has a time complexity of O(n) in the worst case. For sorted arrays, binary search is a more efficient algorithm with a time complexity of O(log n).

**Q6. Find the last index of the element in the array ??**

```java
public class lastIndex {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 14, 75, 23, 14};

        int target = 14;

        System.out.println(lastIndex(arr, target));   // Output: 8
    }
    
    static int lastIndex(int[] arr, int target){
        
        if (arr.length == 0){
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target){
                return i;
            }
        }
        
        return Integer.MAX_VALUE;
    }
}
```

**Note** : Linear search is best suited for unsorted arrays, as it has a time complexity of O(n) in the worst case. For sorted arrays, binary search is a more efficient algorithm with a time complexity of O(log n).

**Q7. Find the all index of the element in the array ??**

```java
public class findAllIndex {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 14, 75, 23, 14};

        int target = 14;

        System.out.println(Arrays.toString(allIndex(arr, target)));   // Output: [4, 6, 9]
    }
    
    static int[] allIndex(int[] arr, int target){
        
        if (arr.length == 0){
            return new int[]{-1};            //return -1 if array is empty
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        
        int[] index = new int[count];           //create an array of size count
        int j = 0;                               //initialize j to 0
        for (int i = 0; i < arr.length; i++) {   //run the loop
            if (arr[i] == target){                //if element found
                index[j] = i;                    //store the index in the array
                j++;                              //increment j
            }
        }
        
        return index;
    }
}
```

**Q8: Search in 2D array ?**

```java
public class linearSearchIn2D{
    public static void main(String[] args) {
        
        int[][] arr2d = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int target = 5;
        
        System.out.println(linearSearchIn2DArray(arr2d, target));  //output: true
        
        
        //if we want index of the element
        int[] ans = linearSearchIn2DArray2(arr2d, target);
        System.out.println(Arrays.toString(ans));  //output: [1, 1]
        
        //find maximum in 2D array
        System.out.println(maximumIn2DArray(arr2d));  //output: 9
    }
    
    static boolean linearSearchIn2DArray(int[][] arr, int target){
        
        if (arr.length == 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    retun true;
                }
            } 
        }
        
        return false;
    }
    
    static int[] linearSearchIn2DArray2(int[][] arr, int target){
        
        if (arr.length == 0){
            return new int[]{-1, -1};      // here we used new keyword cause we are directly returning array without initializing it.
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};          // here we used new keyword cause we are directly returning array without initializing it.
                }
            }
        }
        
        return new int[]{-1, -1};   // here we used new keyword cause we are directly returning array without initializing it.
    }
    
    static int maximumIn2DArray{int[][] arr}{
        if (arr.length == 0){
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
```

**Q9. [[LeetCode 1295]](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/) Find Numbers with Even Number of Digit **

```java
public class evenNumberOfDigit{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        
        System.out.println(findNumbers(nums));  //output: 2
    }
    
    static int findNumbers(int[] nums){
        count = 0;
        
        if (nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (evenDigit(nums[i])){
                count++;
            }
        }
    }
    
    static boolean evenDigit(int num){
        int count = 0;
        
        //if num is 0 then return false
        if (num == 0){
            return false;
        }
        
        //there may be negative number
        //so convert it to positive
        // num = Math.abs(num);
        //OR
        if (num < 0){
            num = num * -1;
        }
        
        //count the number of digit
        
        //for example num = 7896
        //while(num != 0){    >yes it is not equal to 0
        //count++;            >count = 1
        //num = num / 10;     >num = 789
        //}
        
        //It will repeat until we have the count of the digit
        
        while(num != 0){
            count++;                        
            num = num / 10;
        }
        
        //after counting the digit if the count is even return true
        if (count % 2 == 0){
            return true;
        }
        
    }
}
```

**Q10. [[LeetCode 1672]](https://leetcode.com/problems/richest-customer-wealth/description/) Richest Customer Wealth **

```java

```