package day45_interface_vs_abstact.shape;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super("Square");
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0)
            throw  new RuntimeException("Invalid side");

        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                 //just add super.toString()+......look minute  3,30
                super.toString()+//it is easiest way to carry the parent toString method into the subClasses
                ",side=" + side +
                '}';
    }
}
