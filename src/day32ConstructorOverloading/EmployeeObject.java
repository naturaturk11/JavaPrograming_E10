package day32ConstructorOverloading;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1=new Employee("hasan");

        Employee employee2=new Employee("Marry",'F');

        Employee employee3=new Employee("melih",'M',"SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }



}
