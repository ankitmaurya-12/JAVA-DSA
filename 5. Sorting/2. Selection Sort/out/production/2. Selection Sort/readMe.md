**Selection Sort:**

Steps:
1. Select maximum 
2. swap with it correct position
3. then sort in remaining element

Time Complexity:

it will compare to (n-1) , (n-2), (n-3) .....4 , 3 , 2 , 1 , 0.

Hence Time Complexity will be

( n - 1 ) * ( ( n - 1 ) + 1 ) / 2  ~= n^2

Worst case : n^2 || Best Case : n^2

**Note:** It performs well on small lists / Arrays.