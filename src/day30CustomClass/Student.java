package day30CustomClass;

public class Student {

public  String name;//instance variable
public  char gender;
public  int age;
public int ID;
public char grade;

    //!!!!!!!to generate setinfo by using shortcut ...right button+generate+constructor+select all


    /*1 public Student(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }*/
   //2  !!!!!!!and replace the name with setInfo after adding void
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name+" is coding");
    }
    public void sleep(){
    System.out.println(name+" is sleeping");
}

}



