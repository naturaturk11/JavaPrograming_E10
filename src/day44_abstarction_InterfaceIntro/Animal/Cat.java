package day44_abstarction_InterfaceIntro.Animal;

import day39Recap.Shape.ShapeObjects;

public final class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+" eats cat food");

    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
