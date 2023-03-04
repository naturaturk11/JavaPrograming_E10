package day37_Inheritance.OtelTask;

public class Chef extends Employee{


    public Chef(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void cuisine(){
        System.out.println(name+" is capable for preparing variety of food");

    }





}




