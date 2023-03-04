package day16ForLoopStringPractice;

public class DigitLEttersSPECİALcHARS {

    public static void main(String[] args) {

        String str = "Cydeo12345678!'    ^+%&WoodenSpoon";//sace is also special character

        String digits = "";//123456
        String letters = "";//addsaytdgssıu
        String specialChars = "";//!^+%&'


        for (int i = 0; i < str.length(); i++) {//i: index numbers of str(0-index)
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {//if the character is btn 0 and 9 then chr equals to digits
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {//if the character is btn A-Z THE str equals to letters
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {//if the character is btn a-zTHE str equals  to letters
                letters += ch;
            } else {
                if (ch !=' ' ) {//if the special character is not space
                    specialChars += ch;
                }//if the character is neither digit or letter, then it is a special character


            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }}












