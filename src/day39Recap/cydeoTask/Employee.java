package day39Recap.cydeoTask;

public class Employee extends Person {//before inheriting the new variables  is good to add!!!!!!!!!!!
    private int employeeIt;
    private  String jobTitle;
    private double salary;



    //!!!!!!!!CARE AFTER İNHERETİNG USİNG EXTENDS NEW CONSTRUCTOR WERE ADDED İNC ALL PERSON AND EMPLOYEE FİELDS
//CONSTRUCTOR SHOULD BE CREATED


    public Employee(String name, int age, char gender, int employeeIt, String jobTitle, double salary) {
        super(name, age, gender);
       /*this.employyeIt = employyeIt;
        this.jobTitle = jobTitle;
        this.salary = salary;*/
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  set method is used instead of this method to provides some changes later
   setEmployyeIt(employeeIt);
   setJobTitle(jobTitle);
   setSalary(salary);





    }

    public int getEmployeeIt() {//could be added some pre-conditions
        return employeeIt;
    }

    public void setEmployyeIt(int employyeIt) {
        this.employeeIt = employyeIt;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" is working");
    }
// care about the changes and added stressed below carefully
    public String toString() {//apart from what new fields were added, the extended fields should be added manually/explicitly
        return "Employee{" +
                "name='" + getName() + '\'' +//é!!!!!!name age and gender called by get
                ", age=" + getAge() +//name age and gender called by get
                ", gender=" + getGender() +//name age and gender called by get
                ",employeeIt=" + employeeIt +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }
}
 /*2. Create a sub class of Person named Employee:
        Extra variables:
        employeeId, jobTitle, salary

        Encapsulate all the fields

        Add a constructor to set all the fields

        Methods:
        work()
        toString()*/