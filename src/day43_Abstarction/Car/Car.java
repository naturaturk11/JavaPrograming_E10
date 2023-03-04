package day43_Abstarction.Car;

public abstract class Car {//the abstact class have no private,static and final

    private final String brand,model;
    private  String color;

    private   final int year;
    private double price;


    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if (year<1886){
            throw new RuntimeException("ınvalid year:"+year);
        }
        this.year = year;
       setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("Price is invalid");
        }
        this.price = price;
    }

    public abstract void start(); {}//much details could be inserted by the subclass only
        //!!!!!no body here              //in parent class cannot be given any details ib body
    public  void stop(){
        System.out.println("Press The Break");
    };

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}
