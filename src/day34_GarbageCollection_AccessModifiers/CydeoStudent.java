package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {



    public  String studentName;
    public static String schoolName="Cydeo School";



    public CydeoStudent(String studentName){
        this.studentName=studentName;

    }

    static {
        schoolName="Cydeo SCHOOL";
    }

}
class  CydeoStudentObject{

    public static void main(String[] args) {



        CydeoStudent cydeoStudent1=new CydeoStudent("jimmy");

        CydeoStudent cydeoStudent2=new CydeoStudent("katthy");
        System.out.println(cydeoStudent1.schoolName);
        System.out.println(cydeoStudent2.schoolName);



    }
}