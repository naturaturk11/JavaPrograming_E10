package day33_Statics;

import day31Constructors.Student;

import java.util.Arrays;

public class StudentsObject {


    public static void main(String[] args) {


        Students student1=new Students("Hale");

        System.out.println(student1);

        Students student2=new Students("Ahmet",'M');
        System.out.println(student2);

        Students student3=new Students("Nigar",11);
        System.out.println(student3);

        Students student4=new Students("Hulk",12,'A');
        System.out.println(student4);

        Students student5=new Students("Mole",'F',42);
        System.out.println(student5);

        Students student6=new Students("Holga",'F',38,78);
        System.out.println(student6);

        Students student7=new Students("Ali",'M',24,76,'B');
        System.out.println(student7);

        System.out.println(student1==student2);

        Students[]students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println("...........................................");
        System.out.println(Arrays.toString(students));










    }
}
