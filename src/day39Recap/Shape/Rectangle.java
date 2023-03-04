package day39Recap.Shape;

public class Rectangle extends Shape {

    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {//it is reference of below length
        if(length<=0){
            System.err.println("Invalid length");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {//it is reference of below width
        if(width<=0){
            System.err.println("Invalid WİDTH");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle( double length, double width) {//constructor is changed by set and get to be changed later
        super("Rectangle");
       setLength(length);//İT İS refered to the set length  make once more changes
       setWidth(width);//İT İS refered to the set width  make once more changes
        //this.width = width;  //minutes 1.30-40
    }

    @Override
    public double area() {
        return length*width;//minutes 1.35-45
    }

    @Override
    public double perimeter() {
        return 2*(length+width);//minutes 1.35-45
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }




}





/*Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter*/