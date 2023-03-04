package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {


    public static void main(String[] args) {


        Car car1=new Car();
        car1.setInfo("bmw","Cmry","black",2002,535622);

        System.out.println(car1);


       Car car2=new Car();
        car2.setInfo("toyota","yaris","blue",2020,15000);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("opel","astra","white",2000,20000);
        System.out.println(car3);

        //Car[]cars={car1,car2,car3};
        ArrayList<Car> carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car eachcar : carList) {
            System.out.println(eachcar.brand+": "+ eachcar.price);
        }


        System.out.println(".....................................................");

        /*bmw:2005-2008;
        toyota: 1995-1997

         */

        carList.removeIf(p->p.brand.equals("bmw") &&p.year<=2008);
        carList.removeIf(p->p.brand.equals("toyota") &&p.year<2021);

        System.out.println(carList);


        System.out.println(".................................................................");








    }


}
