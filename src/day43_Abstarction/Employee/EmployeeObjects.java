package day43_Abstarction.Employee;

public class EmployeeObjects {


    public static void main(String[] args) {

         //Person person=new Person() ;








        Tester tester=new Tester("Hasan",42,'M',1,"QA",120000);
        Developer developer=new Developer("Mrry",38,'F',2,"DEV",150000);
        Teacher teacher=new Teacher("Anna",35,'F',3,"Math teacher",100000);
        Drivers drivers=new Drivers("KEMAL",40,'M',4,"TRUCK",140000);

        System.out.println("tester = " + tester);
        System.out.println("developer = " + developer);
        System.out.println("teacher = " + teacher);
        System.out.println("drivers = " + drivers);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();
        developer.work();
        developer.sleep();
        developer.unitTesting();
        drivers.sleep();
        teacher.work();


    }
}
