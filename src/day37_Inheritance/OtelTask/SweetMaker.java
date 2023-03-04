package day37_Inheritance.OtelTask;

public class SweetMaker extends Employee{


    public SweetMaker(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void sweet(){
        System.out.println(name+" is preparing the sweets by considering the season.");
    }




}
