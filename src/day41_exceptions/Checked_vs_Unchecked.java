package day41_exceptions;

import day39Recap.cydeoTask.Student;

import java.io.FileInputStream;
import java.nio.channels.FileLockInterruptionException;

public class Checked_vs_Unchecked {


    public static void main(String[] args) throws InterruptedException {


        //unchecked exceptions
        int a=10;
        int b=0;
        //System.out.println(a/b);
       // System.out.println("Wooden");


        char[] characters={'A','B','C'};
       // System.out.println(characters[99]);


      Student student=null;

      final  String str="WOODEN Spoon";
       //str=null;
        //System.out.println(str.toUpperCase());

       String str2="";//object!=null

        System.out.println(str2.isEmpty());


        //Checked  Exception


        System.out.println("hello");
        Thread.sleep(3000);

        System.out.println("Cydeo");


       // FileInputStream file=new FileInputStream("path of the file");//checked ones

        System.out.println("java".charAt(2000));//unchecked ones


    }
}
