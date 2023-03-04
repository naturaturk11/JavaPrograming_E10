package day30CustomClass;

public class Car {

public String brand;
public String model;
public String color;
public int year;
public double price;




// to bring toString method use right button of mouse and push the generate and tick the toString
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void setInfo(String  carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;









}

public void drive(){
    System.out.println("Driving "+brand+" "+model);
}


public void start(){
    System.out.println(brand+" "+model+" has started");
}



public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }


}

/*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */