package day37_Inheritance.AnimalTask;

public class Parrot extends Animal {//WHEN NOT DEFAULT CONSTRUCTOR İS USED THE ONLY WAY
                                        // TO ELİMİNATE THE ERROR İS TO USE SHORTCUT


    public String parotWingColor;//added by myself new instance!!!!!!!!

                                                                                     //!!!!!!!!!added by mayself new instance
    public Parrot(String name, String breed, char gender, String size, int age, String color,String parotWingColor) {
        super(name, breed, gender, size, age, color);
        this.parotWingColor=parotWingColor;//this is method for adding new instance!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public void sing(){
        System.out.println(name+" is singing");
    }


}
