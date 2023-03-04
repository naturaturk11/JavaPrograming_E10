package day21_ArrayForEachLoop;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {

        String[] students={"Elif","Sinem","Cihad","David","Aaron","Danial"};

        String[] each= Arrays.copyOf(students,4);
        System.out.println(Arrays.toString(each));
        String[] each1=Arrays.copyOfRange(students,2,5);
        System.out.println(Arrays.toString(each1));
        String[] each2=Arrays.copyOfRange(students,4,7);
        System.out.println("Arrays.toString(each2) = " + Arrays.toString(each2));


    }}
