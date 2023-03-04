package day37_Inheritance.ScrumTask;

public class Tester extends Employee{//tester IS A employee,Tester IS A as well

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void creatingTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }


//no need to create a to String mthod bcsit aws created at the employee class we inhereted
}
