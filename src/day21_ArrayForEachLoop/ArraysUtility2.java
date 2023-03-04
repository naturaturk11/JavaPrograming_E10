package day21_ArrayForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students={"Elif","Sinem","Cihad","David","Aaron","Danial"};

        String[] earlyBİRDS= Arrays.copyOf(students,5);//only first 5 element were copied
        System.out.println(Arrays.toString(earlyBİRDS));
        earlyBİRDS[0]=earlyBİRDS[0].replace("Elif","ayse").toUpperCase();
        System.out.println(Arrays.toString(earlyBİRDS));
    //copyof method begins with the element number not index number

     int[]numbers={1,2,3,4,5,6,7,8,9,10};


     numbers=Arrays.copyOf(numbers,5);//copy of begins always with the first element
        System.out.println(Arrays.toString(numbers));


        System.out.println("..................................................................");

         //each of range is bases on index number

          char[] ch={'A','B','C','D','E','F'};
          char[] ch2=Arrays.copyOfRange(ch,2,5);//last index of ch does not include
        ch2=Arrays.copyOfRange(ch,2,5+1);//last index of ch does not include
        System.out.println(Arrays.toString(ch2));

         int[] scores={10,20,30,40,50,60,70,80,90,100};
         int[]arre={0,1,2,3,4,5,6,7,8,9,5};
         int[]arre1=Arrays.copyOfRange(arre,3,9);
         int[] result=Arrays.copyOfRange(scores,3,7+1);//firstly the former variable is added to the first bloc
        System.out.println(Arrays.toString(result));
        System.out.println("Arrays.toString(arre1) = " + Arrays.toString(arre1));


        int[] result2=Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));

    }
}
