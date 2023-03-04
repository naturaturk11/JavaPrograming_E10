package day16ForLoopStringPractice;

public class SpecialChaDİG {

    public static void main(String[] args) {

        String words = "ABGTR!'^+%&/()  12546987(((;";
        String result = "";
        String digits="";
        String letters="";
        String spcfcChar="";

        for (int i = 0; i < words.length(); i++) {
            char chr=words.charAt(i);

            if(chr>='0'&& chr<='9'){
               digits+=chr;}
            else if (chr>= 'a' && chr<='z') {
                letters+=chr;}
            else if (chr>='A' && chr<='Z') {
                letters+=chr;}
            else{
                if(chr !=' '&& chr!='('){
                    spcfcChar+=chr;
                }
            }


            }
        System.out.println("spcfcChar = " + spcfcChar);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

        }
        }




