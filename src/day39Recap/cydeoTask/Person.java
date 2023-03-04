package day39Recap.cydeoTask;

public class Person {

    private String name;
    private int age;

    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {//constructor is reshaped by the set to be made some changes later
         /*this.name = name;
        this.age = age;
        this.gender = gender;
        */
        //the constructor converted the setName,setAge,setGender to make some changes on later
        setName(name);
        setAge(age);
       setGender(gender);
    }
    public void eat(){
        System.out.println(name+" is eating ");
}
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleping(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*CydeoTask:
        1. Create a class named Person:
        Variables:
        name, age, gender

        Encapsulate all the fields

        Add a constructor to set all the fields

        Methods:
        eat()
        drink()
        sleep()
        toString()













*/
