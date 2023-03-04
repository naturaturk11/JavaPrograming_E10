package day17WhileDoWhile;

public class WhileContainsWord {
    public static void main(String[] args) {


        String a = " hey ara hey ara HEY ARA HEY ARA";
        a = a.toLowerCase();
        int result = 0;


        while (a.contains("ara")) {
            a=a.replaceFirst("ara", ".");

            result++;


        }

        System.out.println(result);

    }



}












