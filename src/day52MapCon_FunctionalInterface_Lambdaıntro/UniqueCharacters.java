package day52MapCon_FunctionalInterface_Lambdaıntro;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {


    public static void main(String[] args) {


        String str="aabbaacaecdef";
       String[] arr=str.split("");

        Map<String,Integer> result=new LinkedHashMap<>();

        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr),each);
            if(frequency==1){
                result.put(each,1);
            }
        }
        System.out.println(result);

        System.out.println("...............................................");

            String rtl="aabbcklttehd";
            String[]arr1=rtl.split("");

            Map<String,Integer>result1=new LinkedHashMap<>();
        for (String each1 : arr1) {
            int frequency=Collections.frequency(Arrays.asList(arr1),each1);
            if(frequency==1){//    freq could be changed
                result1.put(each1,frequency);//each1=key,1=value and it represents the unique ch

            }
        }
        System.out.println(result1);


    }
}
