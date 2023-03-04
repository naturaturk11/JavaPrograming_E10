package day36Inheritance.Incapsulation;

public class StudentObjects {


    public static void main(String[] args) {


        Student student1=new Student("MERYEM",41,'F','B',"Class collage");
        System.out.println(student1);
        student1.setGrade('C');
        System.out.println(student1);
        System.out.println(student1.getName()+" is studying at the "+ student1.getSchoolName());
                           //care for  using get to print the code fragmant

    }
}
