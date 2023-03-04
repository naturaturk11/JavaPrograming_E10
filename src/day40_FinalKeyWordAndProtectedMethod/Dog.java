package day40_FinalKeyWordAndProtectedMethod;

public  final class Dog extends Animal{


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }

    @Override
    public void drink() {//final method is unchangeable and connot be overriden
        System.out.println(getName()+" is drinking beverage");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }






}
