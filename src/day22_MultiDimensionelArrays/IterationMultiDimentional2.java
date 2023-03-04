package day22_MultiDimensionelArrays;

public class IterationMultiDimentional2 {

    public static void main(String[] args) {


        //      İNDEX  0 1 2   0 1 2 3   0 1 2 3 4 5
        int[][]arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //       İNDEX=  0         1         2

/*task1:9 10 11 12 13
        4 5 6
        1 2 3 */


        for (int i = arr2D.length - 1; i >= 0; i--) {//i is index number of 1D arrays from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {//arr2D[i] represents each single of arrrays
                System.out.print(arr2D[i][j]+" ");// j represents the elements starting from to last index

            }
            System.out.println();

        }

        System.out.println(".............................................................");

/*3 2 1
8 7 6 5 4
 12 11 10 9
 */
        for (int i = 0; i < arr2D.length; i++) {// indexes of each arrar started from 0 to the last

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();
        }
        System.out.println(".........................................................");

/*
13 12 11 10 9
8 7 6 5 4
3 2 1
 */







    }



}
