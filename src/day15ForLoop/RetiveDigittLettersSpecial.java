package day15ForLoop;

public class RetiveDigittLettersSpecial {
    public static void main(String[] args) {
        
        /*write a program that can retive the digits,letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
        
        */
        String email="mn@#123Ab!";

        String digit="";
        String letters="";
        String specificChr="";
        
        
        
        
        for (int i = 0; i <email.length() ; i++) {
            char ch=email.charAt(i);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!care
          
            if(ch>='0'&& ch<='9'){
                digit+=ch;
            } else if (ch>='a'&& ch<='z' ){
                letters+=ch;
                
            } else if (ch>='A' && ch<='Z') {
                letters+=ch;

            }else {
                specificChr+=ch;


        }
        
        
    }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specificChr = " + specificChr);
}}
