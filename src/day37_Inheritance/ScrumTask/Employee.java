package day37_Inheritance.ScrumTask;

public class Employee extends Person {//tester IS A employee

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;



    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ",jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=$" + salary +
                ", companyName='" + companyName + '\'' +

                '}';
    }
}
