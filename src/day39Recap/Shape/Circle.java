package day39Recap.Shape;

public class Circle extends Shape{
    //before use extends it is useful to write the fields at first
    private double radius;

    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid Radius:"+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");//bcs of there is only one circle here name changed to circle and delete the string name
        setRadius(radius);//changed to be resetted later...minutes 1.35-45
    }

    @Override
    public double area() {
        return pi*radius*radius;//minutes 1.35-45
    } //formulaof are relaced by overriding

    @Override
    public double perimeter() {//minutes 1.35-45
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                ",pi='" + pi + '\'' +
                '}';
    }
}
