package day43_Abstarction.Employee;

public final class Drivers extends Employee{
    public Drivers(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" drives a truck");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps at least 10 ours");
    }
}
