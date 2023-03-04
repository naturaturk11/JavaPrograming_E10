package day24_ReturnMethod;

public class DuplicateLetters {
    public static void main(String[] args) {

        String letter="adafsgsbhyrtddtrggrpplkkm";

        System.out.println(removeDuplicateLetters(letter));

    }

    public static String removeDuplicateLetters(String letter){

       String result="";
        for (int i = 0; i < letter.length(); i++) {
            String ch=""+letter.charAt(i);

            if(!result.contains(ch)){

                    result+=ch;
                }
            }





        return result;



    }










}
