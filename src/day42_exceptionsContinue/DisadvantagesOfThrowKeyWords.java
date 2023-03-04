package day42_exceptionsContinue;

public class DisadvantagesOfThrowKeyWords {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.5);//throws method used

        System.out.println("Hello World");

        System.out.println(".................");


        System.out.println("Hello");
        MorningWorkout.sleep(2.5);//try/catch used
        System.out.println("Cydeo");

    }




    public static void sleep(double seconds) throws InterruptedException {
            Thread.sleep((long) (seconds * 1000));

        }







}
