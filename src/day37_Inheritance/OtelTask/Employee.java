package day37_Inheritance.OtelTask;

public class Employee extends Person {
    public String jobTitle;
    public double salary;
    public int id;
    public boolean hasInsurance;
    public String otelName;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, boolean hasInsurance, String otelName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.hasInsurance = hasInsurance;
        this.otelName = otelName;
    }

    public void placeOfWorking(){
        System.out.println(otelName+" is serving at the south of the country");
    }

    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", id=" + id +
                ", hasInsurance=" + hasInsurance +
                ", otelName='" + otelName + '\'' +

                '}';
    }
}
