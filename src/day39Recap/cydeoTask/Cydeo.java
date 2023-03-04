package day39Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer=new Developer("Hasan",41,'M',25,"Developer",100000);
        Tester tester=new Tester("Yeliz",38,'F',26,"SDET",95000);
        Teacher teacher=new Teacher("Kaya",40,'M',20,"BİO teacher",85000);
        Student student=new Student("Orac",42,'M',"SDET",8);

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("..............................................");

        developer.setAge(36);
        System.out.println(developer.getAge());

        tester.setSalary(152000);
        System.out.println(tester.getSalary());

        developer.work();
        tester.work();
        teacher.work();
        student.getFieldOfStudy();

        System.out.println("..............................................");

        developer.drink();
        developer.eat();
        developer.sleping();

        developer.fixingBugs();
        tester.drink();
        tester.sleping();
        tester.eat();
        tester.createTicket();

        System.out.println("....................................................");

        teacher.drink();
        teacher.eat();
        teacher.sleping();
        teacher.work();

        System.out.println(".......................................................");

        student.drink();
        student.eat();
        student.sleping();
        student.study();

    }
}
/* 7. Create a class named Cydeo:
        create objects of Tester, Developer,Teacher, Student

        test all the functions of each objects

        Analyze the relationships between the classes*/