package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {




        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(50);

        ArrayList<Integer>result=new ArrayList<>();
        for (Integer integer : list) {

            if(!(result.contains(integer))){
                result.add(integer);

            }

        } System.out.println("result = " + result);
    }
}
