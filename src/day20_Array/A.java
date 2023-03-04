package day20_Array;


import java.util.Arrays;

public class A {

    public static void main(String[] args) {

        String[] names = {"Hasan mutlu", "Kenan mutlu"};


        for (int i = 0; i <names.length ; i++) {
            String a=names[0].substring(0,names[1].indexOf(" "));
            String n=names[1].substring(0,names[1].indexOf(" "));
            String n1= names[0].substring(names[0].indexOf(" ")+1,names[0].indexOf(" ")+2);
            n1=n1.toUpperCase();
            String n2= names[0].substring(names[0].indexOf(" ")+2);
            System.out.println(a+" "+n1+n2+"\n"+n+" "+n1+n2);


        }



    }


    }









