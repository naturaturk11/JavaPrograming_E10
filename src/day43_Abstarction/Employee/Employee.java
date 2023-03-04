package day43_Abstarction.Employee;

public abstract class Employee extends Person {

    private final int id;

    private String jobTitle;

    private double salary;


    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setJobTitle(jobTitle);
       if(id<0){
           throw new RuntimeException("Invalid ID:"+id);
       }
        this.id=id;
       setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();//abstract method only in abstract class or interface


    @Override
    public String toString() {//!!!!!since the name,age and gender were
                             // declared as a private in person class, it should be added here as manually
        return "Employee{" +//it is always modified manually dk 3.14
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                ",id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }
}
