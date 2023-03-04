package day37_Inheritance.OtelTask;

public class Recepsionist extends  Employee {


    public boolean haslanguages;

    public Recepsionist(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender, jobTitle, salary, id, hasInsurance, otelName);
    }


    public void registerNewGuests(){
        System.out.println(name+" is registering the new guest' entrance");
    }
    public void knowOtelRegSystem(){
        System.out.println(name+" has skill of otel registration system");
    }

    public String toString() {
        return "Recepsionist{" +
                "haslanguages=" + haslanguages +
                '}';
    }
}
