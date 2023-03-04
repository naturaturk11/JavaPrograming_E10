package day38OOP_Inheritance_MethodOverriding;

public class Cartask {

    public String brand,model,color;

    public int year,miles;

    public double price;


    public Cartask(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }


    public void start(){
        System.out.println(brand+" "+ model+ " is starting");
    }
    public void drive(){
        System.out.println(brand+" "+ model+" is driving");
    }

    public String toString() {
        return "CarTask{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=$" + price +
                '}';
    }

    /*public void fly(){ fly method is not common for all the cars,parent class should only contain common feature

    }*/
}
/*Warmup task:
carTask:
Create a class called Car
instance variables:
brand, model, year, price, color, miles
add a constructor to set all the fields

instance methods:
start(), drive(),toString()

Create the following sub classes of Car:
1. Toyota:
extra methods:
reliabile()



*/