package day41_exceptions;

public class FinalyBlock {

    public static void main(String[] args) {

       int[] arr={1,2,3};
         try {
             System.out.println(arr[10]);
         }catch (RuntimeException e){
             System.out.println(" Catch Block");
             e.printStackTrace();
             System.exit(0);

         }finally {
             System.out.println(" Finally  Block");
         }






    }
}
