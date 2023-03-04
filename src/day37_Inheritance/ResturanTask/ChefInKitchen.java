package day37_Inheritance.ResturanTask;

public class ChefInKitchen extends Employee{


    public ChefInKitchen(String name, int age, char gender, String registeredCountry, long id, int theExperiancedYear, double salary, boolean hasInsurance, int workOursWeekly) {
        super(name, age, gender, registeredCountry, id, theExperiancedYear, salary, hasInsurance, workOursWeekly);
    }

    public String cuisine(){
        System.out.println(name+" is capable for preparing variety of food");
        return cuisine();
    }


}
