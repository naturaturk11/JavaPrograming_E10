package day37_Inheritance.OtelTask;

public class HumanResourceChef extends Employee {


    public HumanResourceChef(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void recruitment(){
        System.out.println(name+"is preparing the procedure for recruitment for "+otelName);
    }
}
