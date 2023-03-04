package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(20);//2
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50);//5

        System.out.println("numbers = " + numbers);

        numbers.add(2,25);//inserted the number instead of replacing
        numbers.add(5,45);
        numbers.add(3,68);
        System.out.println(numbers);
        System.out.println(numbers.size());

        int lastIndex=numbers.size()-1;
        System.out.println(lastIndex);

        int num= numbers.get(3);

        System.out.println("num = " + num);


        System.out.println("....................................................");

        for (int i = 0; i <numbers.size() ; i++) {

            System.out.print(numbers.get(i) + " ");


        }




        System.out.println("...........................................");
        //Set İS A REPLACE METHOD  NOT İNSERT



           ArrayList<String> list=new ArrayList<>();
           list.add("Java");
           list.add("Pyhton");
           list.add("Java");
           list.add("C#");
           list.add("Rugby");

            System.out.println(list);
             list.set(2,"JavaScript");
             list.set(3,"C++");
                      System.out.println(list);


        }





    }




