package day19_loopReview;

import day16ForLoopStringPractice.Char;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Freq5 {
    public static void main(String[] args) {

        String str="hfkfhsuurmflgpttkggmmss";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
             char ch=str.charAt(str.indexOf('m'));
             char each=str.charAt(i);
            if(ch==each){
                count++;

            }


        }
        System.out.println("count = " + count);



        String[]arr=str.split("");
        Map<String,Integer> list=new LinkedHashMap<>();
        for (String each : arr) {
         int frequency= Collections.frequency(Arrays.asList(arr),each);
         list.put(each,frequency);
        }
        System.out.println("list = " + list);

    }
}
