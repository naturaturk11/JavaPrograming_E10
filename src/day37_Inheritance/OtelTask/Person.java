package day37_Inheritance.OtelTask;

public class Person  {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating the food");
    }
    public void drink(){
        System.out.println(name+"is drinkinig only tea at the working time");
    }
    public void sleep(){
        System.out.println(name+" should sleep well to more effective at the working time");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
