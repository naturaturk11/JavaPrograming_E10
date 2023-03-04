package day16ForLoopStringPractice;

public class Reverse2 {
    public static void main(String[] args) {

        String sentence="Tremendous Race";

        //result would be: ecaR suodnemerT

        String result="";

        for(int i=sentence.length()-1;i>=0;i--){
            result+=sentence.charAt(i);

        }
        System.out.println("result = " + result);



    }
}
