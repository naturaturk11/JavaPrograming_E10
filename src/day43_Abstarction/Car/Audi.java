package day43_Abstarction.Car;

public final class Audi extends Car {
       //final key was added not to being inherited bcs of its unique feature of autopark
    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
                //!!!!!!!
    }



    @Override
    public void start() {
        System.out.println("Push the start button");

    }

    public void autopark(){//this is a unique feature that makes the class uniheritance by adding the final keyword
        System.out.println(getBrand()+""+getModel()+" has autopark");
    }






}
