package day41_exceptions;

import day39Recap.cydeoTask.Employee;

public class Multi_Catch_Blocks {

    public static void main(String[] args) {

        Employee employee=null;


        try {
               throw new ArithmeticException();
            //System.out.println(employee.getSalary());//null pointer exception

        }catch ( IndexOutOfBoundsException e ){
            System.out.println("First catch  block");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Second catch created");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("third catch created");
            e.printStackTrace();
        }catch (RuntimeException e){ //read the pdf first!!!!!parent exception type can not be before the child exception type
            //!!!the parent exception got the fish on condition that the null pointer exception comes before
            System.out.println("Four catch created");
            e.printStackTrace();
        }
        System.out.println("program be solved");


        System.out.println(".....................................................");


        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }





    }
}
