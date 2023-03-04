package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int list1=list.set(0,6);
        System.out.println(list1);
        System.out.println(list);


    }




}
