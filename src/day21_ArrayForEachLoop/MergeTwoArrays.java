package day21_ArrayForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {



      String[] group1={"Ali","Layan"," Aysenur"};//3
      String[] group2={"Maria","Aygun"," Duygu","Suat","Valeriy"};//5

       String[] students=new String[group1.length+group2.length];//8

       //it should be created a new  each loop for  new group


        int i=0;//index number representative is created
        for (String each : group1) {
           students[i++]=each;
        }


        for (String each : group2) {
            students[i++]=each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("..........................................................");

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H','j'};


        char[] chars=new char[ch1.length+ch2.length];


      int j=0;

        for (char ch : ch1) {
            chars[j++]=ch;

        }

        for (char ch : ch2) {
            chars[j++]=ch;

        }

        System.out.println(Arrays.toString(chars));














    }
}
