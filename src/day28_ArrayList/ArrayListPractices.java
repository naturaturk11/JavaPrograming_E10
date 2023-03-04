package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractices {


    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list .add(10);
        list .add(20);
        list .add(30);
        list .add(40);
        list .add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {//i:index element



            list.set(i,list.get(i)*2);

        }System.out.println(list);

        System.out.println("..................................................");

        ArrayList<String> employees=new ArrayList<>();

        employees.add("Suat");
        employees.add("Emre");
        employees.add("Olga");
        employees.add("Orhan");
        employees.add("Zehra");
        employees.add("Kenan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);

       boolean r1= employees.remove("Orhan");//whether this object was removed from the list or not
       // System.out.println(employees);
        System.out.println(r1);


    }
}
