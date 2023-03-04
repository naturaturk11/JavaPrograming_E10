package day39Recap.cydeoTask;

public class Teacher extends  Employee {


    public Teacher(String name, int age, char gender, int employeeIt, String jobTitle, double salary) {
        super(name, age, gender, employeeIt, jobTitle, salary);
    }


/*public Teacher(String name, int age, char gender, int employeeIt, String jobTitle, double salary) {
        super(name, age, gender, employeeIt, jobTitle, salary);
    }*/

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }
}





/*5. Create a sub class of Employee named Teacher

        Override the work method
*/
