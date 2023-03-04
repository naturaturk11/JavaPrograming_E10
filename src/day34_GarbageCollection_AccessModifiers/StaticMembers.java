package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {


   static class class1{

    }

    public static int num=100;


    public static void method(){

    }

    static {


    }





}
class A{//autor class cannot be static bur inner class could be
     static class  B{//inner class
       public static void method1(){

       }
    }
//any class could be static  on condition that the calss itself should be inner class only
}

class  C{
    public static void main(String[] args) {
        A.B.method1();
    }

}