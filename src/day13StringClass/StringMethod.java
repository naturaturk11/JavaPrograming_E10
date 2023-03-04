package day13StringClass;



public class StringMethod {


    public static void main(String[] args) {

 String word="Cydeo";
 char thirdChar= word.charAt(0);
        System.out.println("...........................................");
  String  s1="Batch is the best batch.";
  int totalChars=s1.length();
        System.out.println("totalChars = " + totalChars);

  char lastChar= s1.charAt(s1.length()-1);//last index number....carefull and memorize the formula
  char lastChar1=  s1.charAt(s1.length()-3);
        System.out.println("lastChar1 = " + lastChar1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("................................................");

        String str="wooden spoon";
        str= str.toUpperCase();
        System.out.println("str = " + str);

        String s="JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);

        String sentence="today one of the greatest days in my life.";
        sentence=sentence.toUpperCase();


        System.out.println("sentence = " + sentence);
        System.out.println("s = " + s);
        System.out.println("str = " + str);


        System.out.println("lastChar1 = " + lastChar1);
        System.out.println("lastChar = " + lastChar);


        System.out.println("totalChars = " + totalChars);


        System.out.println("thirdChar = " + thirdChar);
    }
}
