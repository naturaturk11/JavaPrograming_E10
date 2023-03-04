package day43_Abstarction.Car;

public class CarShop {

    public static void main(String[] args) {

       // Car car=new Car() we cannot create object from Abstarct class,because abstract is not concrete


        Honda honda=new Honda("Accord","White",2000,1530);
        honda.setColor("green");
        Audi audi=new Audi("q7","Pink",2021,2250);
        honda.setPrice(5000);
        Tesla tesla=new Tesla("Model 3","Red",2020,3000);
        tesla.setColor("Blue");
        audi.setPrice(3500);
        audi.autopark();
        audi.start();

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
