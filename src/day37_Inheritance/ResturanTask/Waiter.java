package day37_Inheritance.ResturanTask;

public class Waiter extends Employee{


    public Waiter(String name, int age, char gender, String registeredCountry, long id, int theExperiancedYear, double salary, boolean hasInsurance, int workOursWeekly) {
        super(name, age, gender, registeredCountry, id, theExperiancedYear, salary, hasInsurance, workOursWeekly);
    }

    public String languages(){
        System.out.println(name+" "+" is speaking at least two foreign languages");
        return languages();
    }
    public String cloth(){
        System.out.println(name+"has clear and ironed clothes");
        return cloth();
    }
}
