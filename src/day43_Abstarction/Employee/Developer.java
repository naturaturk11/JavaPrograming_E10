package day43_Abstarction.Employee;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+"is writing code");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps more than six ours");

    }

    public final void unitTesting(){
        System.out.println(getName()+" tests the unit");
    }



}
