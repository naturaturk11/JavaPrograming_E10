package day37_Inheritance.ResturanTask;

public class Employee extends Person {



    public int theExperiancedYear;
    public double salary;
    public boolean hasInsurance;
    public int workOursWeekly;

   public void punctiolity(){
       System.out.println(name+" "+"should be punctial!");
   }
   public void rules(){
       System.out.println(name+" "+"should obey yhe rules that written in contract ");
   }

    public Employee(String name, int age, char gender, String registeredCountry, long id, int theExperiancedYear, double salary, boolean hasInsurance, int workOursWeekly) {
        super(name, age, gender, registeredCountry, id);
        this.theExperiancedYear = theExperiancedYear;
        this.salary = salary;
        this.hasInsurance = hasInsurance;
        this.workOursWeekly = workOursWeekly;
    }

    public String toString() {
        return "Employee{" +

                " name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", registeredCountry='" + registeredCountry + '\'' +
                ", id=" + id +
                ", theExperiancedYear=" + theExperiancedYear +
                ", salary=" + salary +
                ", hasInsurance=" + hasInsurance +
                ", workOursWeekly=" + workOursWeekly +
                '}';
    }
}
