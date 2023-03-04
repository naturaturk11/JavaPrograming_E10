package day43_Abstarction.Employee;

import day39Recap.Shape.ShapeObjects;

public final class Teacher extends Employee {


    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps more than seven ours");
    }
}
