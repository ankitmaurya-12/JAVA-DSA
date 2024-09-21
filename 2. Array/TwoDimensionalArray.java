// 2D array
// row * column
//always forget psvm [don't]

public class TwoDimensionalArray {
    public static void main(String[] args) {

//    int[][] numArr = new int[2][3];

//    int[][] inArray = {{1,2,5},{8,9,5}};
    //here outer bracket will tell no. of rows
    //and inner bracket will tell the no. of columns
    // it is an 2*3

//    num nameArr[0][0] = 5;

    int[][] AnkitArr={{1,5,8,7},{1,2,4},{5,7,8,3,5}};
    //its an 2*0
//    System.out.println(AnkitArr.length);
//    System.out.println(AnkitArr[0].length);
//    System.out.println(AnkitArr[1].length);

//  2D Array Taversal

    int i =0;
    while (i< AnkitArr.length){
        int j=0;
        while (j<AnkitArr[i].length){
            System.out.print(AnkitArr[i][j]+" ");
            j++;
        }
        System.out.println();
        i++;
    }
    }
}
