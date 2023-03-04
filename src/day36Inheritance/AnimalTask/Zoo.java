package day36Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {


    Dog dog1=new Dog();
    dog1.setInfo("Max","Husky",'F',"Small",2,"White");
    dog1.eat();
    dog1.sleep();
    dog1.drink();
    dog1.move();
    dog1.bark();
        System.out.println(dog1);
        System.out.println();

        Cat cat1=new Cat();
    cat1.setInfo("holy","poty",'M',"MİDDLE",3,"GREY");
    cat1.meow();
    cat1.drink();
    cat1.move();
    cat1.scratch();
    cat1.sleep();
        System.out.println(cat1);
        System.out.println();
        Tiger tiger=new Tiger();
    tiger.setInfo("bruno","BENGAL",'M',"BİG",4,"ORANGE");
    tiger.hunt();
    tiger.roar();
    tiger.drink();
    tiger.eat();
    tiger.move();
    tiger.sleep();
        System.out.println(tiger);

    }

}
