package day42_exceptionsContinue;

//minute2.20
class FadyException extends RuntimeException{

    public FadyException(String message){
       super(message);
    }

    public FadyException(){
        super("Time for a short break");
    }



}//custom checked exception

class NoBreakException extends Exception{//custom unchecked exception

        }

public class CustomExceptions {
    public static void main(String[] args) {


        throw new FadyException();


    }

}
