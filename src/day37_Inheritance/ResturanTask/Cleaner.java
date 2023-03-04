package day37_Inheritance.ResturanTask;

public class Cleaner extends Employee {
    public Cleaner(String name, int age, char gender, String registeredCountry, long id, int theExperiancedYear, double salary, boolean hasInsurance, int workOursWeekly) {
        super(name, age, gender, registeredCountry, id, theExperiancedYear, salary, hasInsurance, workOursWeekly);
    }

    public String dutyOfClenars(){
        System.out.println(name+" is cleaning each places of the restaurant in each day");
        return dutyOfClenars();
    }
}
