package day43_Abstarction.Car;

public final class Tesla extends Car {


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
                    //!!!!!!!!
    }

    public void start() {
        System.out.println("Say\"start\"");
    }
    public void autopilot(){
        System.out.println(getBrand()+" "+getBrand()+" has auto pilot feature");
    }
}
