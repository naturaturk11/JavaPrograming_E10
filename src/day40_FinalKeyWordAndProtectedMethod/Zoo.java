package day40_FinalKeyWordAndProtectedMethod;

public class Zoo {


    public static void main(String[] args) {



        Dog dog=new Dog("Max","Husky",'M',"Black","Large",4);

        dog.setName("Karabas");
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());


        dog.drink();

    }
}
