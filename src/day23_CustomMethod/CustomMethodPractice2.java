package day23_CustomMethod;

public class CustomMethodPractice2 {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println();
        helloWorld5Times();
        System.out.println();
        helloWorld5Times();
        System.out.println();
        helloCydeo5Times();
        System.out.println();
        evenNumbers();
    }
    //create a functionn that can print helloworld5Times===>helloworld5Times()

    public static void helloWorld5Times(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello WORLD");
        }


    }

    //create a function that can print hello cydeo 5 times

   public static void helloCydeo5Times(){
       for (int i = 0; i <5 ; i++) {
           System.out.println("Hello Cydeo");
       }

   }

// create a functionthat print all the even numbers from1-10
    public static void evenNumbers(){
        int num=0;
        for (int i = 2; i <=10 ; i+=2) {
            System.out.print(i+" ");
            }
        }




    }




