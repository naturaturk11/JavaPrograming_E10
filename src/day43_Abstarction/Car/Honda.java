package day43_Abstarction.Car;

public final class Honda extends Car {


    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
                    //!!!!!!!
    }


    public void stop() {
        System.out.println("");
    }


    public void start() {//child is responsible to create more detalis
        System.out.println("Twist is using to ignite");
    }


}
