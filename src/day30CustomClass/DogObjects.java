package day30CustomClass;

public class DogObjects {


    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='M';
        dog1.size="small";
        dog1.color="white";



        Dog dog2=new Dog();
        dog2.name="ACE ";
        dog2.breed="Husky";
        dog2.age=4;
        dog2.color="black";
        dog2.gender='F';
        dog2.size="large";


        Dog dog3=new Dog();

        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);


      dog1.eat();

      dog3.bark();





    }




}
