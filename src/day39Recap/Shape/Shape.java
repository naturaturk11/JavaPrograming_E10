package day39Recap.Shape;

public class Shape {
    private String name;//common issue but private

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);//1: sth went wrong
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        return  0;
    }//0 is temp override since each implementation of area is different
    public double perimeter(){
        return 0;
    }//0 is temp override since each implementation of perimeter is different

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +//area added
                ",perimeter='" + perimeter() + '\'' +//perimeter added
                '}';
    }
}
/*Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}








Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter



*/