package day30CustomClass;

public class Employee {




                    //1 step is to create  variables
public String name;
public char gender;
public int age;
public int ID;
public String jobTitle;
public double salary;
public boolean isFullTime;



                          //2. step is to create setinfo by considering the procees how it built
    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


                           //3.step is to generate toString method by using right button of mouse

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= +$" + salary +                 //$$$$$$$$$$$$dolar sign should be added
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
    System.out.println(name+"is working "+"at the position "+jobTitle);
}








}

