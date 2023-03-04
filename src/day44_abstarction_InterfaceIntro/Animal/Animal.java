package day44_abstarction_InterfaceIntro.Animal;

public abstract class Animal {//when here seen abstarct class should be paren and inheretable

   private String name;

   private final String breed;

   private final char gender;
   private int age;
   private String size;
   private final String color;


   public final static boolean canBreath=true;//final and static have different purpose !!!!


    public Animal(String name, String breed, char gender, int age, String size, String color) {
       setName(name);
        this.breed = breed;
        this.gender = gender;

        if(!(gender=='M' || gender=='F'))//!!!!!!important point care care care
            throw new RuntimeException("INVALİD GENDER: "+gender);
       //THE PRECONDİTİONS OF GENDER SHOULD DECLARed BEFORE THE AGE
        //the reason why gender conditions is declared here is gender is final and no setGender in construcor!!!!!!!!!!!!
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

   public final void drink(){
       System.out.println(name+" is drinking water");
   }

   public abstract void eat();//cannot be this method final otherwise this method is not allowed to be overridden by subclass


    @Override
    public String toString() {
        //!!!!!!!!!insdeta of Animal we created a new formula
        return getClass().getSimpleName()+"{" +//changing the name of animal gives us any of related name of class
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */
