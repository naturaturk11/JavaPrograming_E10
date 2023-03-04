package day42_exceptionsContinue;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println(".........Push up STARTS......................");

        for (int i = 1; i < 31; i++) {
            System.out.print("\rPush up " + i);

            sleep(2.5);
        }
        System.out.println("\n..................Push ups complated..........");

        System.out.println(".................Pull up started.................. ");


        for (int i = 1; i < 31; i++) {
            System.out.print("\rPull up " + i);

            sleep(1.5);
        }

        System.out.println(".................Pull up complated.................. ");
    }






    public static void sleep(double seconds){//this part is going to be used in selenium frequently

        try {
            Thread.sleep((long)(seconds*1000));//to deal with the exception should be created  a custom method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
/*
*  Do 30 push-ups and try  pausing 1.5 seconds in each
*
* Do 20 Pull-ups and try pausing 2.5 seconds in each
*
*
* */