package day21_ArrayForEachLoop;

import java.util.Arrays;

public class CopyOf_CopyOfRange {
    public static void main(String[] args) {


        String[] students={"Elif","Sinem","Cihad","David","Aaron","Danial"};

        String[]birds= Arrays.copyOf(students,3);//it basis of element not index
        System.out.println(Arrays.toString(birds));


        System.out.println(".....................................................................");

        char[]ch={'a','b','c','d','e','f'};
        char[]ch1=Arrays.copyOfRange(ch,1,5+1);
        System.out.println(Arrays.toString(ch1));







    }
}
