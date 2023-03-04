package basics;

import day30CustomClass.Employee;

public class N {
    public void main(String[] args) {

       Employee employee=new Employee();
       Manager manager=new Manager();
       Director director=new Director();






    }
    class Employee{
        public int salary;
    }
    class Manager extends Employee{
        public int budget;
    }
    class Director extends Manager{
        public int stocOptions;
    }
}
