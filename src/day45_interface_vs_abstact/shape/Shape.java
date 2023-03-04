package day45_interface_vs_abstact.shape;

public abstract class Shape {



    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {//!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return getClass().getSimpleName()+"{" +//added getClass().getSimpleName() to see the current class name
                "name='" + name + '\'' +
                ",area='"+area()+'\''+        //area variable was added manually
                ",perimeter='"+perimeter()+'\''+//area variable was added manually
                '}';
    }
}
