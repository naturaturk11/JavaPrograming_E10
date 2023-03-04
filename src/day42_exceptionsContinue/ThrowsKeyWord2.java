package day42_exceptionsContinue;

public class ThrowsKeyWord2 {

    public static void main(String[] args) {

        System.out.println("TEST STARTED");

        try {
            System.out.println(8/0);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Test complated");




    }

}
