package day32ConstructorOverloading;

public class CarObject {


    public static void main(String[] args) {


        Car car1=new Car("BMW");

        Car car2=new Car("HONDA","CIVIC");

        Car car3=new Car("TOYOTA","COROLLA",2021);

        Car car4=new Car("FIAT","DOBLO",2021,70000);

        Car car5=new Car("MERCEDEZ","KOMP",2021,120000,"White");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);




    }
}
