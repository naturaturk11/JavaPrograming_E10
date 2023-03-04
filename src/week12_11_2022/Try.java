package week12_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Try {


    public static void main(String[] args) {

      ArrayList<String>words=new ArrayList<>(Arrays.asList("During","storm","rain","FELL","season","cloudy","safe"));
      ArrayList<Integer>lengths=new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        System.out.println(lengths);

    }



}


