package day37_Inheritance.OtelTask;

public class Manager extends Employee{


    public Manager(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void manage(){
        System.out.println(name+" is organizing each part of "+otelName);
    }
}
