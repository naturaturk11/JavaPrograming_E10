package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {


    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));


        employees.retainAll(Arrays.asList("David","Ahmed"));//the unmatched names were removed
        System.out.println(employees);

        System.out.println(".....................................................................");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.startsWith("M"));
        //list.removeIf(p->p.charAt(0)=='M'); alternative solution to find the names which starts "M"



        
       // System.out.println(list);//finding other names of which initial begin other alpfabet from "M"
        
        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
