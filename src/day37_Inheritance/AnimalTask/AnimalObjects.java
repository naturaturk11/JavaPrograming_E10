package day37_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {


Dog dog1=new Dog("Max","Tpfhy",'M',"Small",2,"GREY");
        System.out.println(dog1);
        dog1.bark();
        dog1.drink();
        dog1.move();
        System.out.println();

Cat cat1=new Cat("NAHR","TOPFHY",'F',"sMALL",3,"WHİTE");
        System.out.println(cat1);

        cat1.scratch();
        cat1.drink();
        System.out.println();

Parrot parrot1=new Parrot("King","Macaw",'M',"small",6,"Green","pink");
parrot1.sing();
parrot1.drink();
parrot1.eat();
parrot1.sleep();

    }
}
