package day37_Inheritance.ScrumTask;

public class BusinnessAnaylyst extends Employee {
    public BusinnessAnaylyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Businness Analyst", id, salary, companyName);
    }


    public void analyze(){
        System.out.println(jobTitle+name+"is analyzing the documents");
    }
}
