package day35Encapsulation.encapsulation;

public class EmployeeObjects {


    public static void main(String[] args) {

     Employee employee1=new Employee("Nala",'M',28,120000);

     employee1.setAge(25);
        System.out.println(employee1);


        Employee employe2=new Employee("",'M',45,100000);
        employe2.setName("Zalım");
        employe2.setSalary(employe2.getSalary()+20000);
        System.out.println(employe2);

    }
}
