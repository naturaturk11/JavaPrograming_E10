package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee {//SM IS A employee
    public ScrumMaster(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Scrum MASTER", id, salary, companyName);
    }                             //!!!!!!!!!!!!!!!!!!!!UNİQUE TİTLE


    public void arrangeMeeting(){
        System.out.println(jobTitle+name+" is organizing the sprints");
    }

}
