package day44_abstarction_InterfaceIntro.Animal;

public final class Parrot extends Animal implements Playable,Flyable{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats corn");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with smart toys");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly generally with group members");
    }
}
