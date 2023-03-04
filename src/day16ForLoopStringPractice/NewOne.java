package day16ForLoopStringPractice;

public class NewOne {
    public static void main(String[] args) {
/*
String s1 = " the one person I met YESTERDAY";

        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            String ch = "" + s1.charAt(i);or char ch=s1.charAt(i)

            if (!result.contains(ch)  ) {
                result += ch;


            }

        }
        System.out.println("result = " + result);


   */

        String a="it depends on hard working";
        String uniqChar="";

        for (int i = 0; i< a.length(); i++) {
            String chr=""+a.charAt(i);
            //char p=a.charAt(i);

            if(!uniqChar.contains(chr)){
                //if(!uniqChar.contains(""+chr)){
                uniqChar+=chr;
            }


        }

        System.out.println("uniqChar = " + uniqChar);


        String sent="the number you have called cannot to be reached att the moment";
        String uniq="";

        for (int i = 0; i <=sent.length()-1 ; i++) {
            char n=sent.charAt(i);
            if(!uniq.contains(""+n)){
                uniq+=n;
            }
        }
        System.out.println("uniq = " + uniq);


    }
}
