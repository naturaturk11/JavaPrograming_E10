package day35Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

    Person person1=new Person();
    //person1.name="hasan";
    //person1.age=21;

        person1.setName("Hasan");
        person1.setAge(41);

       // System.out.println(person1.name+" : "+p1.age);

        System.out.println(person1.getName()+": "+ person1.getAge());




    }
}
