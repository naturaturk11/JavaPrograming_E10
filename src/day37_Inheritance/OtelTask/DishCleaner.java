package day37_Inheritance.OtelTask;

public class DishCleaner extends Employee{


    public DishCleaner(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }

    public void wash(){
        System.out.println(name+" is washing the dishes atat at the"+otelName);
    }





}
