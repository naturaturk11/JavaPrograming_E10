package day21_ArrayForEachLoop;

import java.util.Arrays;

public class ForEchLoop {

    public static void main(String[] args) {


int[] numbers={10,20,30,40,50,60,70};
   //           1  2  3  4  5  6  7
        for (int i = 0; i < numbers.length; i++) {

            int eachElement=numbers[i];
            System.out.println(eachElement);

        }

        System.out.println("..................................................................");

for(int each:numbers){//elements of the array
    System.out.println(each);
}






    }
}
