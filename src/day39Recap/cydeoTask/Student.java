package day39Recap.cydeoTask;

public class Student extends Person {
    private String fieldOfStudy;

    private int studentId;

    public Student(String name, int age, char gender, String fieldOfStudy, int studentId) {
        super(name, age, gender);
        setStudentId(studentId); //!!!  set method is used instead of this method to provides some changes later
        setFieldOfStudy(fieldOfStudy);
    }

    /*super(name, age, gender);
        this.fieldOfStudy = fieldOfStudy;
        this.studentId = studentId;*/


    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


public void study(){
    System.out.println(getName()+" is studying");
}


//// care about the changes and added stressed below carefully
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
/* 6. Create a sub class of Person named Student

        Extra variables:
        studentId, fieldOfStudy

        Encapsulate all the fields

        Add a constructor to set all the fields

        Encapsulate all the fields

        Methods:
        study()*/