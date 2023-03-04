package day37_Inheritance.OtelTask;

public class SuitcaseCarier extends Employee {


    public SuitcaseCarier(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void cary(){
        System.out.println(name+" is carrying the suicases of the guest whose entrance was registered ");
    }





}
