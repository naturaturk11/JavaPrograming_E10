package day32ConstructorOverloading;

public class CarpetObject {


    public static void main(String[] args) {

/*
    object:
        new ExistingConstructor
 */

Carpet carpet1=new Carpet(3,5,8,true);
Carpet carpet2=new Carpet(10,20,10,false);

        System.out.println(carpet1);
        System.out.println(carpet2);


    }
}
