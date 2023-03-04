package day39Recap.cydeoTask;

public class Tester extends Employee{//before inheriting the new variables  is good to add!!!!!!

   public void createTicket(){//only action is added
       System.out.println(getJobTitle()+getName()+" is creating ticket");//get is used to pull job title and name
   }                    //!!!!!!!!!     !!!!!!!!

    public Tester(String name, int age, char gender, int employeeIt, String jobTitle, double salary) {
        super(name, age, gender, employeeIt, jobTitle, salary);
    }


   /* public void work() {
        super.work();instead of overriding direction we reshaped by giving different action
        care about the super.work() section
    }*/

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing application");
    }
}
 /*3. Create a sub class of Employee named Tester

        Override the work method

        Extra methods:
        createTicket()*/