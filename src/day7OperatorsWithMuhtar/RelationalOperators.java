package day7OperatorsWithMuhtar;

public class RelationalOperators {
    public static void main(String[] args) {


    //>,<=,<>=

    boolean result1=20>40;//false
    boolean result2=2200>40;//true
    boolean resuls3= 199>=200;//false
        // boolean
    boolean results4= 750<=450;//false
    
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("resuls3 = " + resuls3);
        System.out.println("results4 = " + results4);

        //credit score of 720

        int creditscore=745;
         boolean isElligibleForLoan= creditscore>=720;
        System.out.println("isElligibleForLoan = " + isElligibleForLoan);
        boolean result6 =200<180;//false
        System.out.println("result6 = " + result6);
        
        int score=70;
        boolean hasFailed= score<=70;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println(".................................................");

      //Equel
         int x =100;
         int y=200;
         boolean equel= x==y;
        System.out.println(equel);

        boolean results8= "muhtar"=="good guy";

        boolean result9="a"=="A";

        System.out.println(result9);

        boolean result10="Java"=="java";
        System.out.println(result10);
        boolean result11="Java "=="java";// this is false because of the spaces number are not equal
        System.out.println(result11);

        boolean result12= 100!=200;
        System.out.println(result12);

        //boolean result13= 100!="100"; could not compared due to the types of variables-string-int
        //System.out.println(result13);





        
        /**int number='a';
        System.out.println(number);*/

        
        
        
    }

}
