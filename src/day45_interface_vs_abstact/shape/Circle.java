package day45_interface_vs_abstact.shape;

public class Circle extends Shape {

    private double radius;
    private final static double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            throw  new RuntimeException("Invalid ratio");
        }

        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +        //just add super.toString()+......look minute  3,30
                super.toString()+//it is easiest way to carry the parent toString method into the subClasses
                ",radius=" + radius +

                '}';
    }
}
