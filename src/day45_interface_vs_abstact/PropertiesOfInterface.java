package day45_interface_vs_abstact;

public interface PropertiesOfInterface {//intro of features of inteface minuten1.40-

    int a=100;//static and final by default
    static int b=200;//final by default

    //constructor is used only to create objects

    /**public PropertiesOfInterface(int a){
        this.a=a; }

    static {
        b=100;

    }*/
    /*public  void method(){
        System.out.println("Instance  method");
    }
*/
    public default void method1(){
        System.out.println("Static method");
    }
    public default void method3(){
        System.out.println("Default method");
    }
   void method2();


}
