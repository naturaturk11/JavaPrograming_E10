package day42_exceptionsContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrow2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        method1();
        method2();
        method3();
        method4();
        System.out.println("hello");


        String str=null;

        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void method1() throws InterruptedException {

        //new FileInputStream("");
        Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException {
        method1();
    }
 public static void method3() throws FileNotFoundException, InterruptedException {
        method2();
        Thread.sleep(1000);
 }
         //although exception as parent could be used,thats why not recommended, the intelij oferred methods are used instead
 public static void method4() throws FileNotFoundException, InterruptedException {
        method3();
 }






}
