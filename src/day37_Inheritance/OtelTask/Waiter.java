package day37_Inheritance.OtelTask;

public class Waiter extends Employee{

    public Waiter(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void languages(){
        System.out.println(name+" "+" is speaking at least two foreign languages");

    }
    public void cloth(){
        System.out.println(name+" has clear and ironed clothes");

    }
}
