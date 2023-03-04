package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class MultiDimonsionalIntro {
    public static void main(String[] args) {
        String[] group1={"john","ali","kemal"};
        String[] group2={"sevgi","kadir","sevtap"};
        String[] group3={"ayse","hasan","yusuf"};


        String [][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;


        //System.out.println(Arrays.toString(groups));to string is for one dimensionel arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("......................................................................");

     /*{1,2,3,};
     {4,5,6};
     {8,,9,10,11,12};

*/      //      İNDEX 0 1 2   0 1 2 3   0 1 2 3 4 5
        int[][]arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //       İNDEX=0         1         2

        System.out.println(Arrays.deepToString(arr2D));//multidimensional arrays with using deepto string

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));//one single arrays with using to string



        //11
        System.out.println(arr2D[2][3]);/*this is method for reaching elements inside the arrays so that
                                          neither "deepToString nor toString" just print used for element*/












    }}







