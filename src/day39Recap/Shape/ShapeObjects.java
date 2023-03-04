package day39Recap.Shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square=new Square(5);
        square.setSide(6);
            System.out.println(square);
            System.out.println(square);


        System.out.println(".................................................");

        Rectangle rectangle=new Rectangle(3,6);//when used the number which restricted by set gives an unexpected result
        System.out.println(rectangle);
        rectangle.setLength(10);//lenght is changed and the result was affected
        System.out.println(rectangle.getLength());

        System.out.println(rectangle);
        System.out.println(rectangle.getName());

        System.out.println(".....................................");

        Circle circle=new Circle(5);
        circle.setRadius(10);//the radius  changed
        System.out.println(circle.getRadius());//new number is executed
        System.out.println(circle);//the result was affected from the changes directly
        System.out.println(circle.getName());//name of the circle is reached by using getname

    }
}
