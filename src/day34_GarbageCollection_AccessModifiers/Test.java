package day34_GarbageCollection_AccessModifiers;
import day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;
import static day34_GarbageCollection_AccessModifiers.Circle.*;

public class Test {


    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println(".........................................");

       //find sum of 10,20
      int a1=  sumOfTwo(10,20);
        System.out.println(a1);

        //find the sum fo 100,200
       int a2= sumOfTwo(100,200);
        System.out.println(a2);

        int a3 =subtractionOfTwo(200,100);
        System.out.println(a3);

        int a4=maxNumber(25,36);
        System.out.println(a4);


    }
}
