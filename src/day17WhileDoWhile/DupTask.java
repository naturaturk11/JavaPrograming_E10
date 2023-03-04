package day17WhileDoWhile;

public class DupTask {


    public static void main(String[] args) {

        String a="ABcohtdlBCEa121236359";
        String result="";

        for (int i = 0; i <a.length() ; i++) {
           a=a.toLowerCase();
            String ch=""+a.charAt(i);
            if(result.contains(ch)){
                break;}
            result+=ch;
        }
        System.out.println("result = " + result);






    }
}
