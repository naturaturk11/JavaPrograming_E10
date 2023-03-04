package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

       char[]letters=new char[26];

        letters[0]='A';
        letters[1]='B';
        //.......

       //!!!!!!!! 1. solutions

        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }


        System.out.println(Arrays.toString(letters));


        // solution 2
        for (char i='A',j=0;i<='Z'&&j<letters.length;i++,j++){//!!!!!!!here is used more than one variable char(i='A' and int as an int-j(symbolize index number)
            letters[j]=i;//j=index, i=char....it is method to convert of index to char

        }
        System.out.println(Arrays.toString(letters));



        // solution 3
        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));





        System.out.println(Arrays.toString(letters));


        System.out.println("............................................................");










    }
}
