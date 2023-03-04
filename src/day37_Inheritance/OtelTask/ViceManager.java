package day37_Inheritance.OtelTask;

public class ViceManager extends Employee{

    public ViceManager(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void help(){
        System.out.println(name+" helps to manager at "+otelName);
    }
}
