package day37_Inheritance.ResturanTask;

public class Person {
    public String name;
    public char gender;
    public int age;
    public String registeredCountry;
    public long id;

    public Person(String name, int age,char gender, String registeredCountry, long id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.registeredCountry = registeredCountry;
        this.id = id;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", registeredCountry='" + registeredCountry + '\'' +
                ", id=" + id +
                '}';
    }
}
