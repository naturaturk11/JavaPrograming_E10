package day30CustomClass;

import java.util.ArrayList;

public class StudentObjects {


    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("hasan",'M',25,12345678,'C');
        System.out.println(student1);

        Student student2=new Student();
        student2.setInfo("mert",'M',24,25436512,'A');


        Student student3=new Student();
        student3.setInfo("melisa",'F',26,25416513,'B');


        Student student4=new Student();
        student4.setInfo("murat",'M',29,254145512,'F');


        Student student5=new Student();
        student5.setInfo("MERYEM",'F',42,2125486512,'A');

        Student[] students={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);

        }

        System.out.println(".............................................................");

        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>();

        for (Student eachStudent : students) {
            if(eachStudent.grade=='A'){
                earlyBirds.add(eachStudent);
            }else {
                angryBirds.add(eachStudent);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
